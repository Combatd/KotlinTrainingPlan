// Implement a kind of date arithmetic. Support adding years, weeks and days to a date. 
// You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.
// At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument. 
// Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt
// Then, try to support adding several time intervals to a date. You may need an extra class.

import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

// DateUtil#addTimeIntervals takes in a TimeInterval Object and an integer
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

// new RepeatedTimeInterval takes in a TimeInterval and Int
class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
// TimeInterval::times takes the current instance and a number into RepeatedTimeInterval
operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}