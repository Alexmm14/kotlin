package com.al3xmm14.android_master.exercise

/*
*
* Las entradas de cine suelen tener precios diferentes según la edad de los espectadores.

En el código inicial proporcionado en el siguiente fragmento de código, escriba un programa que calcule estos precios de boletos basados ​​en la edad:

Precio de entrada para niños de $15 para personas de 12 años o menos.
El precio estándar de la entrada es de 30 dólares para personas de entre 13 y 60 años. Los lunes, el precio estándar de la entrada se reduce a 25 dólares para este mismo grupo de edad.
Un precio de entrada para personas mayores de 61 años es de 20 dólares. Supongamos que la edad máxima de un espectador de cine es de 100 años.
Un -1valor para indicar que el precio no es válido cuando un usuario ingresa una edad fuera de las especificaciones de edad.*
*
*
 */

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    return when(age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday){
            25
        }else{
            30
        }
        in 61..100 -> 20
        else -> -1

    }
}