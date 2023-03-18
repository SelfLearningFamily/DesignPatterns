import builder.CivilEngineer
import builder.HouseBuilder
import builder.IglooHouseBuilder
import factory.DrinkFactory
import factory.juice.JuiceFactory
import factory.shake.ShakeFactory
import prototype.Bike
import prototype.Prototype
import prototype.makeJaguar


fun main(args: Array<String>) {

//    factoryPatternDemo()
  //  builderPatternDemo()
    prototypePatternDemo()


}

fun builderPatternDemo(){
    val modernVillaBuilder : HouseBuilder = IglooHouseBuilder()
    val engineer : CivilEngineer = CivilEngineer(modernVillaBuilder)

    engineer.constructHouse()

     engineer.house.houseDetails()

}


fun factoryPatternDemo(){
    println("Drink_root_ide_package_.factory.DrinkFactorys.joinToString()}")
    var drink_1 = DrinkFactory.getDrink( 1,"Orange")
    var drink_2 = DrinkFactory.getDrink( 2,"Strawberry")
    var drink_3 = DrinkFactory.getDrink( 1,"Orange")
    var drink_4 = DrinkFactory.getDrink( 3,"Gauva")
    var drink_5 = DrinkFactory.getDrink( 2,"Mango")
    var drink_6 = DrinkFactory.getDrink( 2,"Date")

    drink_1.drink()
    drink_2.drink()
    drink_3.drink()
    drink_4.drink()
    drink_5.drink()
    drink_6.drink()

}

fun prototypePatternDemo(){
    var bike : Bike = Bike()
    var basicBike :Bike = bike.clone()
    basicBike.showDetail()
    var advBike : Bike = makeJaguar(bike)
    advBike.showDetail()
}