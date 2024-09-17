package id.ac.polbeng.depandi.test_kelas

import java.text.NumberFormat
import java.util.*

open class EmployeeD{
    //use "open" modifier to allow child child classes to override this property
    open val baseSalary : Int = 3000000
}
class Programmer : EmployeeD(){
    //use "override" modifier to override the property of base class
    override val baseSalary: Int = 5000000
}
class SoftwareEngineer : EmployeeD(){
    //use "override" modifier to override the property of base class
    override val baseSalary: Int = 6000000
}
class ProjectManager : EmployeeD(){
    //use "override" modifier to override the property of base class
    override val baseSalary: Int = 8000000
}
fun toRupiahFormat(baseSalary : Int) : String{
    val localeID = Locale("in","ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}
fun main() {
    val employee = EmployeeD()
    println("Rata-rata gaji ${employee.javaClass.simpleName} = ${toRupiahFormat(employee.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")

    val SoftwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${SoftwareEngineer.javaClass.simpleName} = ${toRupiahFormat(SoftwareEngineer.baseSalary)}")

    val ProjectManager = ProjectManager()
    println("Rata-rata gaji ${ProjectManager.javaClass.simpleName} = ${toRupiahFormat(ProjectManager.baseSalary)} ")
}