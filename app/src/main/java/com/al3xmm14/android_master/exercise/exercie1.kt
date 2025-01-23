package com.al3xmm14.android_master.exercise

/*
Normalmente, su teléfono le proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código, escriba un programa que imprima el mensaje de resumen en función de la cantidad de notificaciones que recibió. El mensaje debe incluir lo siguiente:

El número exacto de notificaciones cuando hay menos de 100 notificaciones.
99+como el número de notificaciones cuando hay 100 notificaciones o más.

resultado:
You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
 */



fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    }else if(numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}