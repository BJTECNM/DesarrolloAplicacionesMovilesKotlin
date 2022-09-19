package com.example.desarrolloaplicacionesmovileskotlin

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val name = "LaraKnife"
    val pass = "192t0220"
    var auxName: String
    var auxPass: String
    var login = false
    var count = 1

    while (!login){
        if (count!=1) println("Intento $count")
        println("Ingrese su nombre de usuario: ")
        auxName = sc.nextLine()
        println("Ingrese su contraseña: ")
        auxPass = sc.nextLine()

        if (auxName != name){
            println("\nUsuario incorrecto\nVuelva a Intentarlo\n")
        }else if (auxPass != pass){
            println("\nContraseña incorrecta\nVuelva a Intentarlo\n")
        }else{
            println("\nDatos correctos, bienvenido")
            login=true
        }
        count+=1
    }
}
