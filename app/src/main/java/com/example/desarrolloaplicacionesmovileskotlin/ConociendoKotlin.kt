package com.example.desarrolloaplicacionesmovileskotlin

fun main() {
    /**
    var edad: Int = 21
    var peso_kg = 80.2F
    val ip: Byte = 19
    val mascara: Short = 255
    val equipo: Long = 450
    val pi: Double = 3.1415926535897932
    var vivo: Boolean = true
    val inicial: Char = 'B'
    val nombre: String = "LaraKnife"
    println("Nombre: $nombre")
    println("Inicial: $inicial")
    println("Edad: $edad")
    println("Peso: $peso_kg")
    println("Vive: $vivo")
    println("Ip: $ip")
    println("Mascara: $mascara")
    println("Equipo: $equipo")
    println("Pi: $pi")


    val precio = 230.53
    val impuesto = 0.16
    val salida = precio * (1+impuesto)
    println("La cantidad de $precio pesos despues de impuestos es: $salida")
    var total = precio.times(impuesto.plus(1))
    println("La cantidad de $precio pesos despues de impuestos es: $total")
    println(total.toFloat())
     */

    var edad: Int?
    println("Introduce tu edad: ")
    edad = readLine()?.toInt()
    println("Usted tiene $edad años")
}