package eopseo.parser

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

sealed interface Parsing<out T> {
    operator fun <R> invoke(block: (T)->R) = when (this) {
        NotYet -> NotYet
        is Parsed<T> -> Parsed(block(value))
    }
}
object NotYet: Parsing<Nothing>
class Parsed<out T>(val value: T): Parsing<T>

class WillParse<T> {
    var parsing: Parsing<T> = NotYet
    operator fun getValue(thisRef: Any?, property: KProperty<*>) = parsing
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Parsing<T>) {
        if (parsing != NotYet) throw Exception()
        when (value) {
            NotYet -> throw Exception()
            is Parsed<T> -> {
                parsing = value
            }
        }
    }
}
