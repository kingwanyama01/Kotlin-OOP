abstract class Headboy(open var name:String, open var age:Int){
    abstract fun suspendStudent()

    abstract fun punishStudent()
}

class Headgirl(override var name:String, override var age:Int):Headboy(name,age){
    override fun punishStudent() {
        println("Yeah... I can punish students as a head girl")
    }

    override fun suspendStudent() {
        println("Yeah... I can suspend students as a head girl")
    }
}

class Headboytwo(override var name:String, override  var age:Int):Headboy(name,age){
    override fun punishStudent() {
        println("Yeah... I can punish students as a head boy")
    }

    override fun suspendStudent() {
        println("Yeah... I can suspend students as a head boy")
    }
}

fun main(args: Array<String>) {
    var girl = Headgirl("Irene",150)
    println(girl.suspendStudent())

    var boy = Headboytwo("Chris",300)
    println(boy.suspendStudent())



}