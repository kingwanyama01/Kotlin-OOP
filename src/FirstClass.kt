class Person{
    //Properties are just variables to define an object
    var name = "King"
    var age = 100

    //Methods are simply what an object can do
    fun speak(){
        println("Yeah... I can speak")
    }

    fun greet(name:String){
        println("Hello $name")
    }

//    fun getYearOfBirth():Int{
//        return 2020 - age
//    }

    fun getYearOfBirth() = 2020 - age
}

class Car{
    var model = "Prado"
    var capacity = 5

    fun brake(){
        println("Yeah... I can brake")
    }

    fun accelerate(){
        println("Yeah, I can accelerate")
    }

}


fun main(args: Array<String>) {
    var mtu = Person()
    println(mtu.name)
    println(mtu.age)
    println(mtu.speak())
    println(mtu.greet("Chris"))
    println(mtu.getYearOfBirth())

    var gari = Car()
    println(gari.model)

}