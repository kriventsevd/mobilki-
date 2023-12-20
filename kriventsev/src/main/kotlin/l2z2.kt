val sec = 2666
val minutes = sec / 60
val hours = minutes / 60

fun main() {

    println(agoToText(sec))
}

fun agoToText(second: Int) = when {
    second > 3 * 24 * 60 * 60 -> "был(а) давно"
    second > 2 * 24 * 60 * 60 -> "был(а) позавчера"
    second > 24 * 60 * 60 -> "был(а) вчера"
    second > 60 * 60 -> "был(а) в сети $hours час${timeHours(hours)} назад"
    second > 60 -> "был(а) в сети $minutes минут${timeMinutes(minutes)} назад"
    else -> "был(а) только что"
}

fun timeMinutes(min: Int) = when {
    min % 10 == 1 && min % 100 != 11 -> "у"
    min % 10 in 2..4 && min % 100 !in 12..14 -> "ы"
    else -> ""
}

fun timeHours(hours: Int) = when {
    hours == 1 || hours % 100 == 21 -> ""
    hours in 2..4 || hours % 100 > 21 -> "а"
    else -> "ов"

}