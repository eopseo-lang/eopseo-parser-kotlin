package eopseo.parser

open class EsTheory(val backsideTheories: List<EsTheory>) {
    val maxDistance = 50
    val originTheorems: MutableList<EsTheorem> = mutableListOf()

    protected inner class PreTheoremIterator(val targetType: EsType): Iterator<EsTheorem> {
        val originIterator = originTheorems.iterator()
        val backsideIterator = backsideTheories.flatMap {
            it.getAdequateTheorems(targetType)
        }.iterator()

        override fun hasNext(): Boolean {
            return originIterator.hasNext() || backsideIterator.hasNext()
        }

        override fun next(): EsTheorem {
            if (originIterator.hasNext()) return originIterator.next()
            return backsideIterator.next()
        }
    }

    protected inner class PreTheoremIterable(val targetType: EsType): Iterable<EsTheorem> {
        override fun iterator(): Iterator<EsTheorem> {
            return PreTheoremIterator(targetType)
        }
    }

    open fun getAdequateTheorems(targetType: EsType): Iterable<EsTheorem> {
        return PreTheoremIterable(targetType)
    }

    fun selectTheoremJudge(results: List<Valid>): JudgeResult {
        return results.minByOrNull { it.distance } ?: Invalid
    }
}