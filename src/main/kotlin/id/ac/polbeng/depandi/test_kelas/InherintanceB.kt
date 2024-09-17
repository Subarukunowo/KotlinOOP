package id.ac.polbeng.depandi.test_kelas

//Child class (initialized the parents class)
class LaptopB : Computer{
    val batteryLife : Double

    //Calls super() to initialize the Parent class
        constructor(name: String,brand : String,batteryLife : Double): super(name, brand){
            this.batteryLife = batteryLife
        }
    //Calls another constructor (which calls super())
    constructor(name: String,brand: String): this (name, brand, 0.0){

    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery life : $batteryLife")
    }
}

fun main() {
    val myLaptop = LaptopB("Asus Think Pad","Asus")
    println(myLaptop.info())
}