package com.example.rxjava

open class Life() {
    protected var age: Int = 0
    protected var intelligence : Int = 0

    open fun getEnergy() {}
    open fun createThings() {}
}

class Students: Life() {
    override fun getEnergy() {
        super.getEnergy()
        println("gathering energy by eating foods,both plants and meat")
    }

    override fun createThings() {
        super.createThings()
        println("we change the world by consuming energy and using tools")
    }
}

class Plants: Life() {
    override fun getEnergy() {
        super.getEnergy()
        println("using light from the sun and store it")
    }

    override fun createThings() {
        super.createThings()
        println("do whatever the rules tell them to do")
    }
}

fun main() {
    val student = Students()
    student.getEnergy()
    student.createThings()

    val plants = Plants()
    plants.run {
        getEnergy()
        createThings()
    }
}