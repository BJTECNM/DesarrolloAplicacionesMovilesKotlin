package com.example.desarrolloaplicacionesmovileskotlin

import java.util.Scanner

fun main(){
    Scanner(System.`in`)
    println("¿Cuál es la temperatura?")
    val temp = readLine()!!.toFloat()
    comprobarTemp(temp)
}

fun comprobarTemp(temp:Float){
    if (temp<=10) println("Usa un abrigo, hace frío")
    else if (temp >= 25) println("Es mejor que lleves algo ligero, hace calor")
    else println("Te irá bien si usas una Chaqueta, el clima es templado")
}