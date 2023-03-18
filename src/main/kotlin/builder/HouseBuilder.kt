package builder
/**
 * Builder and all the methods included in this builder are necessary steps to create a Product
 * */
interface HouseBuilder {

    fun buildBasement()
    fun buildRoof()
    fun buildStructure()
    fun buildInterior()
    fun getHouse() : House

}