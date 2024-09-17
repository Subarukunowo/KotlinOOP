package id.ac.polbeng.depandi.test_kelas.overridingPropertyGetter

import kotlin.math.E

open class EmployeeF {
    open val baseSalary : Double = 10000.0
    open fun displayDetails(){
        println("I am an Employee")
    }
}
class Developer: EmployeeF(){
    override var baseSalary : Double = super.baseSalary + 10000.0
    override fun displayDetails() {
        super.displayDetails()
        println("I am a Developer")
    }
}

fun main() {
    val employeeF = EmployeeF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    println(employeeF.displayDetails())
}