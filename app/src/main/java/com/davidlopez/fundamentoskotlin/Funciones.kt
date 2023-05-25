package com.davidlopez.fundamentoskotlin

import kotlin.math.abs

fun main(){
    sayHello()
    newTopic("argumentos")
    println( sum(5,4))
    println( res(5,4))
    println(prod(3,9))
    println(newTopic("sobrecarga"))
    showProducts("cola")
    showProducts("bocatas")
    showProducts("leche")

}

private fun sayHello() : Unit{  // unit es igual que void en java
    println("hola kotlin")
}

// funcion que retorna un valor

fun sum(a :Int,b:Int) :Int{
    return a+b

}
fun res (a :Int,b:Int) :Int{
    return a-b
}

// funcion con return implicito

fun prod (a :Int,b:Int) = a*b


// sobrecarga

fun showProducts (name:String) {
    println("$name")
}








// funcion infix .
// La palabra reservada infix permite llamar a una función con la notación de infijo,
// es decir, la capacidad de insertar la invocación de la función entre dos operandos
// con el fin de expresar la operación.

infix fun Int.enableAbs(enable:Boolean)=abs(this)


