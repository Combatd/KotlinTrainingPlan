// Objects with invoke() method can be invoked as a function.

// You can add invoke extension for any class, but it's better not to overuse it:

class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations += 1
      	return this  
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()