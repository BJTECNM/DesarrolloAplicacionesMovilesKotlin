package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    var num = 0

    while (num <= 10) {
        println("El número es: $num")
        num += 1
    }

    do {
        println("El número es: $num")
        num--
    }while (num >= 0)
}