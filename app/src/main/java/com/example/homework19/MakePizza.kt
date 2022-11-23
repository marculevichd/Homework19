package com.example.homework19

class MakePizza (val instruction: Builder){


// разный способ синтаксиса
    fun chooseDough () = dough


    fun removeTomato (): Boolean = true
        fun removePeperoni (): Boolean {
        return true
    }
    fun removeOlives ()= olives
    fun removeBacon () =false
    fun removeCheese () = true
    fun addPineapple () = pineapple


    fun orderDistanceDelivery () = distanceDelivery


    companion object Builder{
// объявление переменных с значением по умолчанию
        var dough:String = "Classic"

        var tomato:Boolean = true
        var peperoni:Boolean = true
        var olives:Boolean = true
        var bacon:Boolean = true
        var cheese:Boolean = true
        var pineapple:Boolean = false


        var distanceDelivery:Int = 1

// сеттеры для переменных
        fun setDough (dough:String) = apply { Builder.dough = dough }

        fun setTomato (tomato:Boolean) = apply { Builder.tomato = tomato }
        fun setPeperoni (peperoni:Boolean) = apply { Builder.peperoni = peperoni }
        fun setOlives (olives:Boolean) = apply { Builder.olives = olives }
        fun setBacon (bacon:Boolean) = apply { Builder.bacon = bacon }
        fun setCheese (cheese:Boolean) = apply { Builder.cheese = cheese }
        fun setPineapple (pineapple:Boolean) = apply { Builder.pineapple = pineapple }


        fun setDistanceDelivery (distanceDelivery:Int) = apply { Builder.distanceDelivery = distanceDelivery }

    }
}


