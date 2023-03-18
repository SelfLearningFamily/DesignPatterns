package builder

/** Concrete Builder
 * Includes the definition of the function as per the ModernVilla
 * */
class ModernVillaBuilder() : HouseBuilder {

    private val newHouse = House()

    override fun buildBasement() {
        newHouse.setBasement("concrete & iron frame")
    }

    override fun buildRoof() {
        newHouse.setRoof("steel brick & concrete")
    }

    override fun buildStructure() {
        newHouse.setStructure("brick & cement")
    }

    override fun buildInterior() {
        newHouse.setInterior("marble, tiles & wood")
    }
    override fun getHouse(): House {
        return newHouse;
    }
}