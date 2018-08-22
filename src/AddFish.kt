fun main (args : Array<String>) {

    println("Adicionando novos peixes ao aquario: ")


    println(canAddFish(10.0, listOf(3,3,3))) //false
    println(canAddFish(8.0, listOf(2,2,2), hasDecoration = false)) //true
    println(canAddFish(9.0, listOf(1,1,3), 3)) // false
    println(canAddFish(10.0, listOf(), 7, true)) //true

}

fun canAddFish(
        tankSize : Double,
        currentFish : List<Int>,
        fishSize : Int = 2,
        hasDecoration : Boolean = true) : Boolean {

    return (tankSize * if (hasDecoration) 0.8 else 1.0) >= (currentFish.sum() + fishSize)

}

