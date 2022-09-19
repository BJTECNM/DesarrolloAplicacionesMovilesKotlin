package com.example.desarrolloaplicacionesmovileskotlin

import java.util.Scanner

fun main(args: Array<String>){
    var scanner = Scanner(System.`in`)
    println("Ingrese su edad: ")
    var edad = scanner.nextInt()

    if (edad >= 18){
        println("Su nombre es ${args[0]} y usted es mayor de edad")
    }else{
        println("Su nombre es ${args[0]} y usted es menor de edad")
    }
}