package com.al3xmm14.android_master.sintaxis

fun main(){
    inmutableList()
    println(mutableList())
}

fun mutableList(){
    val weekDay:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoes", "Jueves", "Viernes")
    println(weekDay)
    weekDay.add("Sábado")
    //
    weekDay.add(0, "Domingo")
    println(weekDay)
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoes", "Jueves", "Viernes")
    println(readOnly.size)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


    println()
    val example = readOnly.filter { it.contains("a") }
    println(example)
    readOnly.forEach{ weekDay -> println(weekDay)}
}