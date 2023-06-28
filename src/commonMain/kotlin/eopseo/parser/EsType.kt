package eopseo.parser

import eopseo.parser.util.pureOrElse

interface EsType {
    var namespace: Parsing<String>

    fun isDirectValidWith(type: EsType, theory: EsTheory? = null): CheckResult
}

class Literal(val id: String): EsType {
    override var namespace: Parsing<String> by WillParse()
    override fun isDirectValidWith(type: EsType, theory: EsTheory?): CheckResult {
        return if (type is Literal && type.id == id) Valid(mutableListOf(),0)
        else Invalid
    }
}

class Any: EsType {
    override var namespace: Parsing<String> = Parsed("")

    override fun isDirectValidWith(type: EsType, theory: EsTheory?): CheckResult {
        return Valid(mutableListOf(),0)
    }
}

class Generic(val id: String): EsType {
    override var namespace: Parsing<String> = Parsed("")
    var outsideType: Parsing<EsType> by WillParse()

    override fun isDirectValidWith(type: EsType, theory: EsTheory?): CheckResult {
        val parsingResult = if (theory == null) outsideType { type.isDirectValidWith(it, theory) }
        else outsideType { checkIsInside(type, it, theory) }
        return parsingResult.pureOrElse { Invalid }
    }
}

class EsTuple(val types: MutableList<EsType>): EsType {
    override var namespace: Parsing<String> = Parsed("")

    override fun isDirectValidWith(type: EsType, theory: EsTheory?): CheckResult {
        if (type !is EsTuple) return Invalid
        val rs = (types zip type.types).map { (t1,t2) ->
            t1.isDirectValidWith(t2,theory)
        }
        val condition = rs.all { it is Valid }
        return if (condition) {
            @Suppress("UNCHECKED_CAST")
            val rsv = rs as List<Valid>
            Valid(mutableListOf(), rsv.maxOf { it.distance }, rsv.toMutableList())
        }
        else Invalid
    }
}






