package id.ac.polbeng.depandi.test_kelas
class Alamat {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}
fun copyAlamat(address: Alamat): Alamat {
    var result = Alamat() // There's no 'new' word in Kotlin
    result.name = address.name //accessor are called
    result.street = address.street
    //...
    return result


}