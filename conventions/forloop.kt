// Kotlin for loop iterates through anything that provides an iterator. 
// It is equivalent to a foreach in other languages like C#
// Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over

class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange:DateRange) : Iterator<MyDate> {
    var currentDate: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = currentDate
        currentDate = currentDate.nextDay()
        return result
    }
    override fun hasNext(): Boolean = currentDate <= dateRange.end
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}