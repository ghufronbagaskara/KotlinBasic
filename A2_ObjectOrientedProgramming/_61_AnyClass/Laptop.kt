package `2_ObjectOrientedProgramming`._61_AnyClass

class Laptop(val name: String) {
}

open class HandPhone(val name: String){
}

class SmartPhone(name: String, val os: String) : HandPhone(name){

}