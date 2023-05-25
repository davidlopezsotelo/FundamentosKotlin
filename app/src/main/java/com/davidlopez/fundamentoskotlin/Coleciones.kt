package com.davidlopez.fundamentoskotlin

import com.davidlopez.fundamentoskotlin.clases.Group
import com.davidlopez.fundamentoskotlin.clases.User

fun main(){

    newTopic("Colecciones")
    newTopic("Solo lectura")

    //creamos una lista de frutas:
    val frutaList= listOf<String>("Manzanas","Peras","Limones","Naranjas")
    println(frutaList.get((0..frutaList.size-1).random()))
    //para averiguar el indice dentro del list: (empezando por 0)
    println("Index de Peras es ${frutaList.indexOf("Peras")}")

    //creamos una lista modificable (mutable):
    newTopic("Mutable list.")

    val myUser=User(0,"David","Lopez", Group.FAMILY.ordinal)// nos da el numero que ocupa FRIEND dentro de enum class
    val bro=myUser.copy(1,"Ivan")
    val friend=bro.copy(2, group = Group.FRIEND.ordinal)

    val usersList= mutableListOf(myUser,bro)
    println(usersList)
    usersList.add(friend)//añadir a la lista
    println(usersList)
    usersList.removeAt(1)//borramos un elemento de la lista por indice
    println(usersList)
    usersList.remove(bro)//borramos un elemento de la lista por elemento
    println(usersList)

    //creamos otra lista mutable
    val userSelectedList= mutableListOf<User>()
    println(userSelectedList)
    userSelectedList.addAll(usersList)//añadimos una lista dentro de otra
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList)


}