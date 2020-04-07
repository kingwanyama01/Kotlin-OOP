interface Drivable{
    fun drive()
}
interface Buildable{
    val timeRequired:Int
    fun build()
}

class Gari(var color:String):Drivable,Buildable{
    override val timeRequired: Int = 120
    override fun build() {
        println("Built a car...")
    }

    override fun drive() {
        println("Driving a car..")
    }
}

class Pikipiki(val color:String):Buildable{
    override val timeRequired: Int = 60
    override fun build() {
        println("Built a super bike")
    }
}

fun main(args: Array<String>) {
    var g1:Buildable = Gari("Gray")
    g1.build()
}
