package eopseo.parser

fun checkIsInside(
    target: EsType, outside: EsType,
    theory: EsTheory, distance: Int = 0,
    maxDistanceRef: DistanceRef = DistanceRef(theory.maxDistance)
): CheckResult {
    if (distance > maxDistanceRef.distance) return Invalid

    if (target.isDirectValidWith(outside,theory) is Valid) {
        maxDistanceRef.distance = distance
        return Valid(mutableListOf(), distance)
    }

    val listOfAdequateTheorems = theory.getAdequateTheorems(target, outside)


    val insideMatchTheorems = listOfAdequateTheorems.filter {
        it.insideTypeMold.isDirectValidWith(target,theory) is Valid
    }
    val outsideMatchTheorems = listOfAdequateTheorems.filter {
        it.outsideTypeMold.isDirectValidWith(target,theory) is Valid
    }

    val oneDistanceResult = theory.selectResult(
        insideMatchTheorems
            .filter { outsideMatchTheorems.contains(it) }
            .map { Valid(mutableListOf(it.getAdequateProof(target,outside)),distance + 1) }
    )
    if (oneDistanceResult is Valid) return oneDistanceResult

    insideMatchTheorems.flatMap { inTheorem ->
        outsideMatchTheorems
            .filter { outTheorem ->
                inTheorem.outsideTypeMold.isDirectValidWith(outTheorem.insideTypeMold,theory) is Valid
            }
            .map { outTheorem ->
                TODO("step recursive process for checking")
            }
    }
    TODO("return recursive checked")
}



class DistanceRef(var distance: Int)

sealed interface CheckResult
object Invalid: CheckResult
class Valid(
    val proofStack: MutableList<EsProof>,
    var distance: Int,
    val children: MutableList<Valid> = mutableListOf()
): CheckResult




