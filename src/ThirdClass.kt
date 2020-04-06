class Admin(var name:String, var age:Int){
    fun registerUsers(){
        println("Yes I can register users")
    }
    fun viewUsers(){
        println("Yes I can view users info")
    }
}




fun main(args: Array<String>) {
    var p1 = Admin("King",100)
    println("Hello ${p1.name}")

    println(p1.registerUsers())
}