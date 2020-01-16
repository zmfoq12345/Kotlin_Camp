package com.example.step01_hellokotlin.Ex_Kotlin

fun main() {
    var map1 = mapOf(Pair("name", "Yang"))
    var map2 = mutableMapOf<String,String>()
    map2.put("name", "lee")
    map2.put("age", "18")

    println(map1.keys)

    for ((key, value) in map2){
        println(key+":"+value)
    }
}

//fun main() {
//    var ob = Emp("Yang", "developer", 1000000)
//    println("name : "+ob.name+"\ndept : "+ob.dept+ "\nsalary : "+ob.salary)
//
//    println()
//
//    var ob2 = Emp()
//    ob2.name = "lee"
//    ob2.dept = "engineer"
//    ob2.salary = 1000000
//    println("name : "+ob2.name+"\ndept : "+ob2.dept+ "\nsalary : "+ob2.salary)
//}
//
//class Emp {
//    constructor()
//    constructor(name: String, dept: String, salary : Int){
//        this.name = name
//        this.dept = dept
//        this.salary = salary
//    }
//
//    var name:String = ""
//        set(value){
//            field = value+"님"
//        }
//
//    var dept:String = ""
//        set(value){
//            field = value
//        }
//
//    var salary:Int = 0
//        set(value){
//            field = value+50000
//        }
//}
