// Default and named arguments help to minimize the number of overloads 
// and improve the readability of the function invocation. 
// The library function joinToString is declared with default values for parameters:

fun joinOptions(options: Collection<String>) = 
options.joinToString(prefix = "[", postfix = "]")