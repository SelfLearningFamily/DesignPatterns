package factory.juice

import factory.Drinks

interface Juice : Drinks {
    val strawberry: String
        get() = "Strawberry"

    val pomegranate: String
        get() = "Pomegranate"

    val orange: String
        get() = "Orange"

}