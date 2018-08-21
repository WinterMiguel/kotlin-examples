fun main(args: Array<String>) {

    var fortuna : String

    for (i in 1..10 ) {

        fortuna = getFortune(birthday = getBirthday())

        println("\nYour fortune is: $fortuna")

    }

}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 0
        28, 31 -> 5
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}