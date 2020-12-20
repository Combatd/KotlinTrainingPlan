// Default collections in Kotlin are Java collections, but there are lots of useful extension functions for them. 
// For example, operations that transform a collection to another one, starting with 'to': toSet or toList.

// Implement an extension function Shop.getSetOfCustomers(). 

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet() // A set made from data class customer objects