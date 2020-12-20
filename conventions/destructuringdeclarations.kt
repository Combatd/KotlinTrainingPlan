// data class will instantiate an object for holding data
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {

    val (year, month, dayOfMonth) = date // declare year, month, dayOfMonth from properties of date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}