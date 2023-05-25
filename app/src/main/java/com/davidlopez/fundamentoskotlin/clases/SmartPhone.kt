package com.davidlopez.fundamentoskotlin.clases

// creamos una clase que hereda de phone , le devemos pasar el numero por parametro

// para poder hererdar de una clase, hay que especificar en dicha clase que puede ser heredada

class SmartPhone(number:Int,val isPrivate:Boolean) :Phone(number) {

    private fun idSmartPhone (){
        println("Class.SmartPhone.")
    }

    //sobreescribimos el metodo shownumber

    override fun showNumber() {
        if (isPrivate) println("Numero Privado") else super.showNumber()// la palabra super hace referencia a la clase padre.
    }
}