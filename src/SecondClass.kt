class People(name:String, age:Int){
    //These are the properties
    var name:String
    var age:Int

    //This is a constructor
    init {
        this.name = name
        this.age = age
    }
    fun salimia(name:String){
        println("Good afternoon $name")
    }

}


fun main(args: Array<String>) {
    var p1 = People("Cheryl",120)
    var p2 = People("Oduor",112)
    var p3 = People("Irene",115)

    println(p1.name)
    println(p3.age)
    println(p2.salimia("Wanyama"))
}


