package eopseo.parser

abstract class Definition {
    var namespace: Parsing<String> by WillParse()
}

open class EsTheorem(
    val id: String,
    val forAllMap: Map<Generic,EsType?>,
    val insideTypeMold: EsType,
    val outsideTypeMold: EsType
): Definition() {
    open val isBackgroundTheorem: Boolean = false
    class DistanceRef(var distance: Int)
    fun judge(theory: EsTheory, type: EsType, distance: Int = 1, maxDistanceRef: DistanceRef = DistanceRef(theory.maxDistance)): JudgeResult {
        if (distance > maxDistanceRef.distance) return Invalid
        if (insideTypeMold.isSame(type)) {
            maxDistanceRef.distance = distance + 1
            return Valid(mutableListOf(this),distance)
        }
        val listOfValid = theory.getAdequateTheorems(type)
            .filter { it.judgeSimple(type) }
            .map { it.judge(theory,it.outsideTypeMold, distance + 1) }
            .filterIsInstance<Valid>()

        return theory.selectTheoremJudge(listOfValid).also {
            if (it is Valid) it.theoremStack.add(0,this)
        }
    }
    fun judgeSimple(type: EsType): Boolean {
        return insideTypeMold.isSame(type)
    }
}

open class BacksideEsTheorem(
    id: String,
    forAllMap: Map<Generic,EsType?>,
    insideTypeMold: EsType,
    outsideTypeMold: EsType
): EsTheorem(id, forAllMap, insideTypeMold, outsideTypeMold) {
    override val isBackgroundTheorem: Boolean = true
}

sealed interface JudgeResult
object Invalid: JudgeResult
class Valid(val theoremStack: MutableList<EsTheorem>, val distance: Int): JudgeResult



