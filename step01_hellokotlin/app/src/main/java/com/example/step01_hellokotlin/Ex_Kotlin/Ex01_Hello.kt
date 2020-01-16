package com.example.step01_hellokotlin.Ex_Kotlin

fun main(){
    val str1 = "Good Morning"
    // str1 = "Good Morning"    값변경 불가

    var str2:String = "korea"
    // var str2:String? = null  null 허용 x / ? 붙여야 함
    str2 = "japan"

    var str3:String? = null
    str3 = "Fighting"

    println(str1)
    println(str2+"      "+str3)

    hello1()
    println(hello2())
}

fun hello1(){
    println("call Hello1")
}
fun hello2():String{
    return "kotlin is fun"
}