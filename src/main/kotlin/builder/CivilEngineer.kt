package builder
/**
 * Director
 * */
class CivilEngineer(private val houseBuilder: HouseBuilder) {

    val house: House get() = houseBuilder.getHouse()

    fun constructHouse() {
        houseBuilder.buildBasement()
        houseBuilder.buildStructure()
        houseBuilder.buildInterior()
        houseBuilder.buildRoof()
    }

}