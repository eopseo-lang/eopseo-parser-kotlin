package eopseo.parser

class EsProof(
    val originTheorem: EsTheorem,
    val insideType: EsType,
    val outsideType: EsType,
    val genericProofs: Map<EsType,List<EsProof>>
) {

}