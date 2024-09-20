package id.ac.polbeng.depandi.test_kelas

fun printNumber(n : Number){
    println("Using Number(n : Number)")
    println(n.toString()+ "\n")
}
fun printNumber(n : Double){
    println("Using Number(n : Double)")
    println(n.toString()+ "\n")
}
fun printNumber(n:Int, str:String){
    println("Using printNumber(n:Int, str:String)")
    println(str + n.toString() + "\n")
}
fun main() {
    val a : Number = 99
    val b = 1
    val c = 3.1
    printNumber(a)
    printNumber(b)
    printNumber(c)
    printNumber(b, "Overloading function ")
}