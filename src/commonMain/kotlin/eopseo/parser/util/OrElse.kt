package eopseo.parser.util

import eopseo.parser.*

fun <T:D,D> Parsing<T>.pureOrElse(defaultValue: ()->D): D = when(this) {
    NotYet -> defaultValue()
    is Parsed -> value
}

fun CheckResult.validOrNothing(nothing: ()->Nothing) = when(this) {
    Invalid -> nothing()
    is Valid -> this
}

fun CheckResult.validOrNull(nothing: ()->Nothing) = when(this) {
    Invalid -> null
    is Valid -> this
}


