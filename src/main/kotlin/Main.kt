fun main() {
    val city = getCity()

    println("В городе $city сейчас жарко")
}

private fun getCity(): String {
    println(
        "Привет! Напиши название города"
    )
    return readLine() ?: throw error("Введите название города")
}
