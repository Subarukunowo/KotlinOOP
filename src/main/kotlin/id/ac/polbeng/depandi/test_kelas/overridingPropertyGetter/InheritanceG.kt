package id.ac.polbeng.depandi.test_kelas.overridingPropertyGetter

open class Base(val name : String){
    init {
        println("Initializing Base")
    }
    open val size : Int = name.length.also {
        println("Initializing size in base : $it")
    }
}
class Derived(name: String,val lastName : String) :
        Base(name.capitalize().also { println("Argument for Base : $it") }) {
            init {
                println("Initializing derived")
            }

    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derived : $it")
    }
        }

fun main() {
    val turunan = Derived("Depandi","Enda")
    turunan.size
}