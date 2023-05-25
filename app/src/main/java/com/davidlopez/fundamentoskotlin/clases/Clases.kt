package com.davidlopez.fundamentoskotlin.clases

import com.davidlopez.fundamentoskotlin.newTopic

fun main(){
    newTopic("Clases.")
    // construimos una variable que llamaremos phone y que sera de tipo Phone .
    //devemos pararle el numero por parametro
    val phone:Phone= Phone(55558858)
    phone.idPhone()
    phone.call()
    phone.showNumber()



    newTopic("Herencia.")
    val smartPhone=SmartPhone(78654321,true)// si private = true, imprimira desconocido
    // podemos llamamos a la funcion call de la clase phone, porque esta heredada
    smartPhone.call()
    smartPhone.showNumber()




    newTopic("Data clases")
    val myUser=User(0,"David","Lopez", Group.FAMILY.ordinal)// nos da el numero que ocupa FRIEND dentro de enum class
    val bro=myUser.copy(1,"Ivan")
    val friend=bro.copy(2, group = Group.FRIEND.ordinal)
    println( myUser.component3())//imprime el componente nº 3 de usuario (el apellido)
    println(myUser)
    println(bro)
    println(friend)




    newTopic("Funciones de alcance.")
    // con with, todo lo que escribamos dentro de las llaves pertenecera al elemento de los parentesis
    //  sin tener que invocarlo con el punto
    with(smartPhone){
        println("Privado? $isPrivate")
        call()
    }
//forma de introducir datos
    friend.group=Group.WORK.ordinal
    friend.name="Pepe"
    friend.lastName="Perez"


// otra forma de hacerlo con apply
    friend.apply {
        group=Group.WORK.ordinal
        name="Pepe"
        lastName="Perez"
    }

    println(friend)

}