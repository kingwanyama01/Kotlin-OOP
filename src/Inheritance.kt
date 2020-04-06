open class Administrator(open var name:String, open var age:Int){
    fun registerUsers(){
        println("Yeah, I can register all the users")
    }

    fun viewUsers(){
        println("Yeah, I can view all the users")
    }
}


class Secretary(override var name:String, override var age:Int):Administrator(name, age){
    fun sendingLetters(){
        println("Yeah... I can send letters")
    }
}

fun main(args: Array<String>) {
    var karani = Secretary(age = 200,name = "Rachael")

    println(karani.registerUsers())
    println(karani.sendingLetters())
}