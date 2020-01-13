package com.example.step01_hellokotlin

fun main(){
    val str1 = "Good Morning"
    // str1 = "Good Morning"    값변경 불가

    var str2:String = "korea"
    // var str2:String? = null  null 허용 x / ? 붙여야 함
    str2 = "japan"

    var str3:String? = null
    str3 = "Fighting"

    println(str1)
    println(str2)
    println(str3)

}