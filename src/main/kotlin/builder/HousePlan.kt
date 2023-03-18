package builder

// optional interface just to creata abstraction
private interface HousePlan {
    fun setBasement(basement: String)
    fun setRoof(roof: String)
    fun setInterior(interior: String)
    fun setStructure(structure: String)
}

/**
 * Product*/
data class House(
    private var basement: String = "",
    private var roof: String = "",
    private var structure: String = "",
    private var interior: String = ""
) : HousePlan {
    override fun setBasement(basement: String) {
        this.basement = basement
    }

    override fun setRoof(roof: String) {
        this.roof = roof
    }

    override fun setInterior(interior: String) {
        this.interior = interior
    }

    override fun setStructure(structure: String) {
        this.structure = structure
    }

    fun houseDetails(){
        println("House Details:")
        println("Basement: $basement")
        println("Structure: $structure")
        println("Roof: $roof")
        println("Interior: $interior")
    }

}