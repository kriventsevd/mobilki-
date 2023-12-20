fun main()
{
    println(exames())

}
fun exames ()
{
    val exams = listOf("Русский", "Англиский", "Физику")
    println("Введите имя студента")
    val student = readln()
    exams.forEach { exam ->
        var ocen = (0..10).random()
        println("$student сдал $exam с балом $ocen")
        if (ocen >= 6) //
            println("Подготовка к экзамену $exam хорошая")
        else
            println("Подготовка к экзамену плохая")
    }

}