package id.ac.polbeng.depandi.test_kelas

class InitOrder (name: String){
    val firstProperty = "First poperty : $name".also  (::println)
    init {
        println("First initializer block that print ${name}")

    }
    val secondProperty = "Second property : ${name.length}".also(::println)
    init {
        println("Second initializer block that print ${name.length}")
    }
}

fun main(){
    val initOrder = InitOrder("RPL")
}