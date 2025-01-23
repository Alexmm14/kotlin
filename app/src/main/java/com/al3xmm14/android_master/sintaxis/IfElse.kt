package com.al3xmm14.android_master.sintaxis



//AND &&
//OR |
fun main(){
    basicIf("Al3")
    ifAnidados()
}

fun ifAnidados(){
    val animal = "Perro"
    if (animal == "Perro"){
        println("Es un prro")
    }else if(animal == "Pajaro"){
        println("Es un pajaro")
    }else{
        println("No es un animal")
    }

}

fun basicIf(name:String){
    if (name == "Al3"){
        println("Hola")
    }else{
        println("No hola")
    }
}