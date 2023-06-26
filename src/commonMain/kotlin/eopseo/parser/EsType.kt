package eopseo.parser

interface EsType {
    var namespace: Parsing<String>

    fun isSame(type: EsType): Boolean
}

class Literal(val id: String): EsType {
    override var namespace: Parsing<String> by WillParse()
    override fun isSame(type: EsType): Boolean {
        return type is Literal && type.id == id
    }
}

class Generic(val id: String): EsType {
    override var namespace: Parsing<String> = Parsed("")
    var outSideType: Parsing<EsType> by WillParse()

    override fun isSame(type: EsType): Boolean {
        return outSideType { it.isSame(type) } != NotYet
    }
}

class EsTuple(val types: MutableList<EsType>): EsType {
    override var namespace: Parsing<String> = Parsed("")

    override fun isSame(type: EsType): Boolean {
        return types.all { it.isSame(type) }
    }
}






