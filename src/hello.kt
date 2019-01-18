fun main(args: Array<String>) {
    var x:Int=1
    val y=2
    var z:Int = x+y

    x=3

    z = x+y
    while (z<10){
        z++
        //println(z)
    }

    println(returnTotal())
}

fun returnTotal():Int{
    return 10+1

}