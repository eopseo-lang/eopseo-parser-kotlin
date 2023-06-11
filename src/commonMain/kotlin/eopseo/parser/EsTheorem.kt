package eopseo.parser

open class EsTheorem(val backsideTheories: Iterable<EsTheory>) {
    val maxDistance = 50
    val theories: Iterable<EsTheory> = PreTheoryIterable()
    val originTheories: MutableList<EsTheory> = mutableListOf()

    protected inner class PreTheoryIterator: Iterator<EsTheory> {
        val originIterator = originTheories.iterator()
        val backsideIterator = backsideTheories.iterator()

        override fun hasNext(): Boolean {
            return originIterator.hasNext() || backsideIterator.hasNext()
        }

        override fun next(): EsTheory {
            if (originIterator.hasNext()) return originIterator.next()
            return backsideIterator.next()
        }
    }

    protected inner class PreTheoryIterable: Iterable<EsTheory> {
        override fun iterator(): Iterator<EsTheory> {
            return PreTheoryIterator()
        }
    }

    fun selectTheoryJudge(results: List<Valid>): JudgeResult {
        return results.minByOrNull { it.distance } ?: Invalid
    }
}