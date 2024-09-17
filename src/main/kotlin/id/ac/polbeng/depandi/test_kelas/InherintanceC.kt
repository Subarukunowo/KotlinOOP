package id.ac.polbeng.depandi.test_kelas

open class Teacher {
    //Must use "open" modifier to allow child classes to override it
    open fun teach(){
        println("Teaching")
    }
    fun info(){
        println("I am teacher")
    }
}
class MathsTeacher : Teacher(){
    //must use "override" modifier to overrride a base class function
    override fun teach() {
        println("Teaching Maths..")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}