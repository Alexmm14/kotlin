package com.al3xmm14.android_master.sintaxis

fun main(){
    //getMonth(2)
    //getTrimestre(5)
    //getsemestre(12)
    result("msms")
}

fun result(value:Any){
    when(value){
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if(value == true) println("Hola")
    }
}

fun getTrimestre(month: Int){
    when(month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercero trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Error")
    }
}
fun getsemestre(month: Int) = when(month){
        //Se puede negar con un !
        in 1.. 6 -> "Primer semestre"
        in 7..12 -> "Tercero semestre"
        else -> "Error"
    }

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Nomviembre")
        11 -> println("Diciembre")
        11 -> println("Enero")
        else -> println("No existe")
    }
}