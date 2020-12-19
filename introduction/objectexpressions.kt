import java.util.*

// Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class. 
// In Kotlin you use Kotlin library extensions instead of java.util.Collections, but this example is still a good demonstration of mixing Kotlin and Java code.

// Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes.

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(x: Int, y: Int) = y - x // sort in descending order
    })
    return arrayList
}