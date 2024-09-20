package id.ac.polbeng.depandi.test_kelas

//Private
private class privateExample {
    private val i = 1
    private fun doSomething(){
        println("Welcome to Private access")
        println("Private Access : $i" )
    }
    fun calldoSomething(){
        doSomething()
    }
}
//protected
open class C(){
    protected val i = 1
}
class D : C(){
    fun getValue() : Int {
        println("Welcome to Protected Access!")
        return i
    }
}

//internal
class internalExample{
    internal val i = 1
    internal fun doSomething(){
        println("Welcome to Internal Access")
        println("Internal Access : $i")
    }
}
//public

class publicExample{
    val i = 1
    fun doSomething(){
        println("Welcome to Public Access!")
        println("Public Access : $i")
    }
}

fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}