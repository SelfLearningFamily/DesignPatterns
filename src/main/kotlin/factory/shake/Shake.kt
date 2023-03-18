package factory.shake

import factory.Drinks

interface Shake : Drinks {
    val banana: String
        get() = "Banana"
    val mango: String
        get() = "Mango"
    val date: String
        get() = "Date & Cream"
}