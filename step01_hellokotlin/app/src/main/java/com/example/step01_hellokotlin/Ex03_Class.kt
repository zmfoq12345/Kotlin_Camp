package com.example.step01_hellokotlin

fun main(){
    var ob1 = Person(19, "Yang")
    println(ob1.age.toString() + ", " + ob1.name)

    var ob2 = Person()
    ob2.name = "Hong"
    ob2.age = 20

    println(ob2.age.toString() + ", " + ob2.name)
}

class Person(var age:Int? = null, var name:String? = null)
