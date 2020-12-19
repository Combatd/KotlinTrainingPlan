// When an object implements a SAM interface (one with a Single Abstract Method), 
// you can pass a lambda (higher order function) instead.

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x }) // sort by descending order by passing a lambda
    return arrayList
}