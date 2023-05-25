package com.davidlopez.fundamentoskotlin

fun main(){
    newTopic("bucles.")

    // llamamos al metodo showPersons y le pasamos pior parametro los nombres que queramos
    showPersons("juan","mary","pablo","javier","antony","fedfe")
}


// creamos un array de argumentos que imprimira todos los elementos de person,
// sin importar el numero de elementos que le pasemos por parametro en la llamada

fun showPersons(vararg persons :String){

    newTopic("bucle for")
    for (person in persons){
        println(person)
    }

    newTopic("bucle while")
    var index =0
    while (index<persons.size){
        if (persons[index]=="pablo") println("es pablo!!")
        println(persons[index])
        index++
    }

    newTopic("bucle when")

    index=(0..persons.size-1).random()
    when(persons[index]){
        "juan"-> println("Es juan")
    }
}