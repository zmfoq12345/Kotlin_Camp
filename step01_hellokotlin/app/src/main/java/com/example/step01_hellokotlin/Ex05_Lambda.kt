package com.example.step01_hellokotlin

fun main() {
//    var sayHello = {name:String -> println("Hello $name")}
//    sayHello("Yang")
//
//    var sum = {a:Int,b:Int-> println("sum : ${a+b}")}
//    sum(10,20)
//
//    var n = {a:Int,b:Int-> println("min : ${a-b}")}(100,1)
//    println(n)

    var list = listOf(1, "2", 3, 4, 5.7, 1, 6)
    println(list.filter{it is Int})
    println(list.find{it is Double})

    val testlist = listOf("A", "B", "C")
    val newList1 = testlist.map {
        "$it!"
    }
    val newList2 = testlist.flatMap {
        "$it!".toList()
    }
    println(newList1)
    println(newList2)
}

//fun sayHello(name:String){
//    println("Hello "+name)
//}