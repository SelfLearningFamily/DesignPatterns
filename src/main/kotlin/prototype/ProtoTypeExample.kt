package prototype

 class Bike : Cloneable{
    var gears : Int = 0
    var type : String? = null
    var model : String? = null
        private set

    init {
        gears = 4
        type = "Standard"
        model = "Leopard"
    }

    public override fun clone(): Bike {
         return Bike()
     }

     fun makeAdvance(){
         gears = 6
         type = "Advanced"
         model = "Jaguar"
     }

     fun showDetail(){
         println("model: $model \ntype: $type\ngear: $gears")
     }
}

fun makeJaguar(bike: Bike) : Bike{
   bike.makeAdvance()
    return bike
}

/**Fintech related prototype usage:
 *
 * */

/** Assume we have a data class as coded below. In this class, currencyCode, currencyDetails and flagpath would
 * remain constant for one currency dao. But conversionRate is something that can frequently change as per the base currency
 * or with time to time.
 * So instead of creating a new object from start we can clone it and update the conversion rate */
data class CurrencyDetails(
    val currencyCode : String? = null,
    val currencySymbol : String? = null,
    val flagPath : String? = null,
    var conversionRate : Double? = null
)
