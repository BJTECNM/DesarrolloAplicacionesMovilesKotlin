package com.example.desarrolloaplicacionesmovileskotlin

fun main(){
    val array: IntArray = intArrayOf(1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6)
    val aux = limpiarArreglo(array)
    println(aux.contentToString())
}

fun limpiarArreglo(array: IntArray): IntArray {
    return array.toSet().toIntArray()
}
