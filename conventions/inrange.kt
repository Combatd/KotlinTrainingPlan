// In Kotlin in checks are translated to the corresponding contains calls:

// val list = listOf("a", "b")
// "a" in list  // list.contains("a")
// "a" !in list // !list.contains("a")

// Add a method fun contains(d: MyDate) to the class DateRange 
// to allow in checks with a range of dates.

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    // checks if an instantiated MyDate is contained in the range including the very last date
    operator fun contains(dateToCheck: MyDate): Boolean = start <= dateToCheck && dateToCheck <= endInclusive
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}