package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    var duracion = 30

    for (i in 0..duracion){
        println("Reproduciendo minuto $i")
    }

    for (i in 1 until duracion step 2){
        println("Reproduciendo minuto $i")
    }
}