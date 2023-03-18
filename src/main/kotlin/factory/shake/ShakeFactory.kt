package factory.shake

import factory.Drinks
import factory.NotAvailable
import factory.juice.Orange
import factory.juice.Pomegranate
import factory.juice.Strawberry

object ShakeFactory {

    fun getShake(flavor : String) : Drinks {
        return when(flavor){
            "Banana"->{  Banana()
            }
            "Mango"->{  Mango()
            }
            "Date"->{  Date()
            }
            else -> { NotAvailable()
            }
        }
    }
}