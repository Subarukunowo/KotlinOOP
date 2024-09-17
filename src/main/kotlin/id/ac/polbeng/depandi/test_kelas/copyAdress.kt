package id.ac.polbeng.depandi.test_kelas

fun copyAddress(address: Address): Address{
    var result = Address() // There's no 'new' word in Kotlin
    result.name = address.name //accessor are called
    result.street = address.street
    //...
    return result


}