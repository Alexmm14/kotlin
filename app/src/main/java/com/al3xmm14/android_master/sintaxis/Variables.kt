package com.al3xmm14.android_master.sintaxis

//Variables

fun main(){
    showMyName("Al3xmm14")
    showMyAge(34)
    val myResult = substrac(32,44)
    println(myResult)
}

fun showMyName(name:String){
    println("Mi nombre es: $name")
}
fun showMyAge(edad:Int = 40){
    println("Mi edad es: $edad")
}


fun substrac(number1:Int, number2: Int):Int{
    return  number1 - number2
}


fun variableAlfanumericas(){
    //Alphanumerical

    //char
    val charExample1:Char = 'a'
    val charExample2:Char = 's'
    val charExample3:Char = '3'

    //string
    val stringExample:String = "String"
    val stringExample1:String = "3"
    val stringExample2:String = "4"

    //Concatenar
    println(stringExample1 + stringExample2)
    println(stringExample1.toInt() + stringExample2.toInt())
    println("Hola soy $stringExample")
}
fun variablesBoolean(){
    //Boolean
    val booleanExample:Boolean = true
    val booleanExample1:Boolean = false
}
fun variablesNumericas(){
    //Valor y variables

    //var / val

    //Numbers

    //int
    val num:Int = 33
    var num1:Int = 22

    //long
    val numLong:Long = 100
    //float
    val numFloat:Float = 10.202f
    //Double
    val numDouble:Double = 3222.2221

    //Funciones aritmeticas
    println(num + num1)
    println(num - num1)
    println(num * num1)
    println(num / num1)
    println(num % num1)

    var newNum: Int = num + numFloat.toInt()
}



