package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    var intArray = intArrayOf(1,2,3,4,5,6,7,8)
    val booleanArray = booleanArrayOf(false,false,true,true)
    val doubleArray = DoubleArray(5){10.0}
    val playlist = arrayOf("Chuky","Avengers","Sherk","Thor")
    for (movie in playlist){
        println(movie)
    }

    var total = 0
    for (elemento in intArray){
        total += elemento
    }
    println("El total es $total")
}