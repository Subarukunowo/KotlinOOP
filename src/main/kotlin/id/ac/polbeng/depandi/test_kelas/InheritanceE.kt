package id.ac.polbeng.depandi.test_kelas.overridingPropertyGetter

open class NewPerson{
    open var age : Int = 1
}

class CheckedPerson : NewPerson(){
    override var age: Int = 1
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 // Works

    val checkedPerson = CheckedPerson()
    checkedPerson.age = -5 //throws IllegalArgumentException : age can not be negative
}