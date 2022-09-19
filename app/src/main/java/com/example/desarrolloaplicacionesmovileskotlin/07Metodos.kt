package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    var namemovie = "Diario de una pasión"
    mostrarMovie()
    mostrarMovie2(namemovie)
}

fun mostrarMovie() {
    val playlist = arrayOf("Chuky","Avengers","Sherk","Thor")
    for (movie in playlist){
        println(movie)
    }
}

fun mostrarMovie2(namemovie : String){
    println("La pelicula es: $namemovie")
}