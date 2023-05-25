package com.davidlopez.fundamentoskotlin

fun main (){

    //llamamos a la funcion y la pasamos el string:

    newTopic("Hola, kotlin")

}
// funcion que recibe un string por parametro llamado topic

fun newTopic(topic:String){

    //imprime en consola lo que le pasemos al parametro mediante la funcion topic
    println ("\n ==================== $topic ===================")
}