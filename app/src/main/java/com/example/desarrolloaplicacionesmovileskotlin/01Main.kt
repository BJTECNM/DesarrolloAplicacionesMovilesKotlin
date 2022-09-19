package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    println("Buen dia, hoy sabado 17 del 2022")

    var numero : Int = 2
    var num = 3
    var num_frac : Float = 2.2f
    var num_frac2 : Double = 2.344
    var resp : Boolean = true
    var cadena : String = "Hoy es sabado 17 de Septiembre 2022"
    var longitud : Int = cadena.length
    var esta_vacia : Boolean = cadena.isEmpty()
    var contiene :Boolean = cadena.contains("sabado")
    println("La longitud de la cadena es: $longitud")
    println("Esta vacia la cadena:  $esta_vacia")
    println("La cadena contiene la palabra sabado: $contiene")
}