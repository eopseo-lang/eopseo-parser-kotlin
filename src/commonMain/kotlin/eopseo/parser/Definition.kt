package eopseo.parser

import eopseo.parser.util.validOrNothing

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

    fun getAdequateProof(targetType: EsType, targetOutsideType: EsType): EsProof {
        val checkedInside = insideTypeMold.isDirectValidWith(targetType).validOrNothing {
            throw IllegalArgumentException("Invalid targetType")
        }
        val checkedOutside = insideTypeMold.isDirectValidWith(targetOutsideType).validOrNothing {
            throw IllegalArgumentException("Invalid targetOutsideType")
        }

        TODO("make and return proof")
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





