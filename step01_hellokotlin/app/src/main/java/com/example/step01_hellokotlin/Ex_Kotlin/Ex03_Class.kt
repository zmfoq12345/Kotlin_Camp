package com.example.step01_hellokotlin.Ex_Kotlin

fun main(){
    var ob1 = Person(19, "Yang")
    println(ob1.age.toString() + ", " + ob1.name)

    var ob2 = Person()
    ob2.name = "Hong"
    ob2.age = 20

    println(ob2.age.toString() + ", " + ob2.name)
}

class Person{
    constructor()
    constructor(age:Int, name:String){
        this.age = age
        this.name = name
    }
    var age:Int = 0
        set(value){
            field = value+5
        }
    var name:String = ""
        set(value){
            field = value+"님"
        }
}
