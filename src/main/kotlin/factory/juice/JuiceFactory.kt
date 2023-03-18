package factory.juice

import factory.Drinks
import factory.NotAvailable

object JuiceFactory {

    fun getJuice(flavor : String) : Drinks {
       return when(flavor){
            "Pomegranate"->{  Pomegranate()
            }
            "Strawberry"->{  Strawberry()
            }
            "Orange"->{  Orange()
            }
            else -> { NotAvailable()
            }
        }
    }

}