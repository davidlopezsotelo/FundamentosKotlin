package com.davidlopez.fundamentoskotlin.clases


//clase que usaremos para crear objetos de tipo phone y le pasamos por parametro el numero en forma de variable

// para que otras clases puedan heredar de esta , hay que delararla como open
// para poder sobreescribir un metodo, tambien hay que declararlo open

// Hacemos que la variable number, sea protectec para que solo se pueda acceder desde esta clase y sus herederas

open class Phone (protected val number:Int){

    fun idPhone(){
       println("Class.Phone.")
   }

// funciones de la clase phone.
    fun call(){

        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi numero es $number")
    }



}