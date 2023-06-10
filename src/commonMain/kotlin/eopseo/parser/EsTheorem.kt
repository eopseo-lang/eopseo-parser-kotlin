package eopseo.parser

class EsTheorem {
    val maxDistance = 50
    val theories: MutableList<EsTheory> = mutableListOf()

    fun selectTheoryJudge(results: List<Valid>): JudgeResult {
        return results.minByOrNull { it.distance } ?: Invalid
    }
}