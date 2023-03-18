package prototype

class ConcretePrototype : Prototype {
    var attributes : String = ""
    override fun clone(): Prototype {
        var clone = ConcretePrototype()
        clone.attributes = this.attributes
        return clone
    }
}