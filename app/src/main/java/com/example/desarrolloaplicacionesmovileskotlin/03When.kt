package com.example.desarrolloaplicacionesmovileskotlin

import java.util.Scanner

fun main(){
    var scanner = Scanner(System.`in`)
    println("Ingrese entre (1 y 7): ")
    var dia_semana = scanner.nextInt()

    when (dia_semana) {
        1 -> {
            println("Es lunes")
        }
        2 -> {
            println("Es martes")
        }
        3 -> {
            println("Es miercoles")
        }
        4 -> {
            println("Es jueves")
        }
        5 -> {
            println("Es viernes")
        }
        6 -> {
            println("Es sabado")
        }
        7 -> {
            println("Es domingo")
        }
    }
}