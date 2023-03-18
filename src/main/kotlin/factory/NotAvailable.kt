package factory

import factory.juice.Juice

class NotAvailable : Drinks {
    override fun drink() {
        println("currently not available")
    }
}