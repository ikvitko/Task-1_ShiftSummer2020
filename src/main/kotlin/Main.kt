fun main() {
    val cityName = getCityName()
    val temperature = getTemperature()

    val city = City(cityName, temperature)

    println("В городе ${city.cityName} сейчас ${weather(city)}")
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
        in -50..15 -> "холодно"
        in 15..25 -> "нормально"
        in 25..50 -> "жарко"
        else -> "катастрофа"
    }
