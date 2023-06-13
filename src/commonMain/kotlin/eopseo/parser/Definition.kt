package eopseo.parser

abstract class Definition {
    var namespace: Parsing<String> by WillParse()
}

class EsTheory(
    val id: String,
    val forAllMap: Map<String,EsType?>,
    val insideTypeMold: EsType,
    val outsideTypeMold: EsType
): Definition() {
    class DistanceRef(var distance: Int)
    fun judge(theorem: EsTheorem, type: EsType, distance: Int = 1, maxDistanceRef: DistanceRef = DistanceRef(theorem.maxDistance)): JudgeResult {
        if (distance > maxDistanceRef.distance) return Invalid
        if (insideTypeMold.isSame(type)) {
            maxDistanceRef.distance = distance + 1
            return Valid(mutableListOf(this),distance)
        }
        val listOfValid = theorem.theories
            .filter { it.judgeSimple(type) }
            .map { it.judge(theorem,it.outsideTypeMold, distance + 1) }
            .filterIsInstance<Valid>()

        return theorem.selectTheoryJudge(listOfValid).also {
            if (it is Valid) it.theoryStack.add(0,this)
        }
    }
    fun judgeSimple(type: EsType): Boolean {
        return insideTypeMold.isSame(type)
    }
}

sealed interface JudgeResult
object Invalid: JudgeResult
class Valid(val theoryStack: MutableList<EsTheory>, val distance: Int): JudgeResult



