package eopseo.parser

import kotlin.reflect.KProperty

sealed interface Parsing<out T> {
    operator fun <R> invoke(block: (T)->R) = when (this) {
        NotYet -> NotYet
        is Parsed<T> -> Parsed(block(value))
    }
}
object NotYet: Parsing<Nothing>
class Parsed<out T>(val value: T): Parsing<T>

class WillParse<T,RT> {
    var parsing: Parsing<T> = NotYet
    operator fun getValue(thisRef: RT, property: KProperty<*>) = parsing
    operator fun setValue(thisRef: RT, property: KProperty<*>, value: Parsing<T>) {
        if (parsing != NotYet) throw Exception()
        when (value) {
            NotYet -> throw Exception()
            is Parsed<T> -> {
                parsing = value
            }
        }
    }
}

