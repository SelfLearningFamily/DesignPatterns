package builder
/** Concrete Builder
 * Includes the definition of the function as per the IglooHouse
 * */
class IglooHouseBuilder : HouseBuilder {

    var newHouse = House();

    override fun buildBasement() {
        newHouse.setBasement("Ice blocks")
    }

    override fun buildRoof() {
        newHouse.setRoof("Ice Dome")
    }

    override fun buildStructure() {
        newHouse.setStructure("ice & water")
    }

    override fun buildInterior() {
        newHouse.setInterior("Ice Carving")
    }

     override fun getHouse(): House {
        return newHouse;
    }
}