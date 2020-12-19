// Add the function compareTo to the class MyDate to make it comparable. 
// After that the code below date1 < date2 will start to compile.

// In Kotlin when you override a member, the modifier override is mandatory.

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    // override a member function for data class MyDate
    // otherDate is instantiated from MyDate
    override fun compareTo(otherDate: MyDate) = when {
        year != otherDate.year -> year - otherDate.year // when the years aren't the same
        month != otherDate.month -> month - otherDate.month // when the months aren't the same
        else -> dayOfMonth - otherDate.dayOfMonth // compare the dayOfMonth if year and month are the same
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2