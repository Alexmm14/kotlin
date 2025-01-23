package com.al3xmm14.android_master.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    println(weekDays[0])



    weekDays[0] = "New value"
    println(weekDays[0])

    for(position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("la posición $position, contiene $value")
    }
}

