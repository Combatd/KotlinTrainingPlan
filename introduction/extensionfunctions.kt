// Implement extension functions Int.r() and Pair.r() 
// and make them convert Int and Pair to RationalNumber.

// Kotlin provides the ability to extend a class with new functionality 
// without having to inherit from the class or use design patterns 
// such as Decorator. This is done via special declarations called extensions. 
// For example, you can write new functions for a class from a third-party library 
// that you can't modify. Such functions are available 
// for calling in the usual way as if they were methods of the original class. 
// This mechanism is called extension functions. 
// There are also extension properties that let you define new properties 
// for existing classes.

// To declare an extension function, we need to prefix its name with a receiver type, i.e. the type being extended.

fun Int.r(): RationalNumber = RationalNumber(this, 1) // Instantiate a data holding object Rational Number
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(first, second) // Extend Pair and Int.r to return a rational number

data class RationalNumber(val numerator: Int, val denominator: Int)