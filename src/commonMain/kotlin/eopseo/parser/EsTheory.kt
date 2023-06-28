package eopseo.parser

open class EsTheory(val backsideTheories: List<EsTheory>) {
    val maxDistance = 50
    val originTheorems: MutableList<EsTheorem> = mutableListOf()

    protected inner class PreTheoremIterator(val targetType: EsType, val outsideType: EsType): Iterator<EsTheorem> {
        val originIterator = originTheorems.iterator()
        val backsideIterator = backsideTheories.flatMap {
            it.getAdequateTheorems(targetType,outsideType)
        }.iterator()

        override fun hasNext(): Boolean {
            return originIterator.hasNext() || backsideIterator.hasNext()
        }

        override fun next(): EsTheorem {
            if (originIterator.hasNext()) return originIterator.next()
            return backsideIterator.next()
        }
    }

    protected inner class PreTheoremIterable(val targetType: EsType, val outsideType: EsType): Iterable<EsTheorem> {
        override fun iterator(): Iterator<EsTheorem> {
            return PreTheoremIterator(targetType, outsideType)
        }
    }

    open fun getAdequateTheorems(targetType: EsType, outsideType: EsType): Iterable<EsTheorem> {
        return PreTheoremIterable(targetType, outsideType)
    }

    fun selectResult(results: List<Valid>): CheckResult {
        return results.minByOrNull { it.distance } ?: Invalid
    }
}