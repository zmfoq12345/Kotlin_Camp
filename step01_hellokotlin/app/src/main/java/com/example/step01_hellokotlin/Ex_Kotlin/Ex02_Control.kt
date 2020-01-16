package com.example.step01_hellokotlin.Ex_Kotlin

fun main(){
    var arr1 = listOf("A", "B","C","D")             // 가변
    var arr2 = mutableListOf("Korea", "America")    // 불변

    for (item in arr1){
        println(item)
    }

    for ((idx, item) in arr2.withIndex()){
        println("$idx, $item")
    }

    // casting
    var str:Any = 50.6 //"kotlin lecture" Any is auto casting
    if (str is Double){
        var str2:Int = str.toInt()
        println(str2)
    }
    return
}