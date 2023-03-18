package factory

import factory.juice.JuiceFactory
import factory.shake.ShakeFactory

object DrinkFactory {

    var juice = 1
    var shake = 2

    fun getDrink(type : Int, flavour : String) : Drinks{
       return when(type){
            juice -> JuiceFactory.getJuice(flavour)
            shake -> ShakeFactory.getShake(flavour)
            else -> NotAvailable()
        }
    }

}