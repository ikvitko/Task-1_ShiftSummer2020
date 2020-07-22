fun main() {
    val cityName = getCityName()
    val temperature = getTemperature()

    val city = City(cityName, temperature)

    println(weather(city))
}

private fun getCityName(): String {
    println(
        "Привет! Напиши название города"
    )
    return readLine() ?: throw error("Введите название города")
}

private fun getTemperature(): Int{
    println(
        "Введите температуру в вашем городе"
    )
    return readLine()?.toIntOrNull() ?: throw error("Введите температуру в виде числа")
}

fun weather(city: City): String =
    when (city.temperature) {
        in -50..15 -> "Холодно"
        in 15..25 -> "Нормально"
        in 25..50 -> "Жарко"
        else -> "катастрофа"
    }
