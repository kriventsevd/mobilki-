
fun main(){
    println("Ввыберите способ оплаты: Visa, Maestro, MasterCard, МИР, VK Pay")
    val card:String= readln()
    println("Вы выбрали $card введите cумму перевода:")
    var pay: Int = readln().toInt()
    val monthpay: Int=7500000
    if (monthpay > 600000 && pay >150000)
    {
        println("Мы не можем выполнить ваш перевод.Вы привысили лимит")
    }
    when(card) {
        "MasterCard" -> if (pay > 300 && pay < 75000) {
            println("Сумма перевода $pay")
        } else {
            val sum = pay - (pay * 0.006 + 20)
            println("Сумма перевода $sum")
        }

        "Maestro" -> if (pay > 300 && pay < 75000) {
            println("Сумма перевода $pay")
        } else {
            val sum = pay - (pay * 0.006 + 20)
            println("Сумма перевода $sum")
        }

        "Visa" -> if (pay > 0)
        {
            val sum = pay - (pay * 0.0075)
            println("Сумма перевода $sum")
        }
        "МИР" -> if (pay > 0)
        {
            val sum = pay - (pay * 0.0075)
            println("Сумма перевода $sum")
        }
        "VK Pay" -> if (pay > 0)
        {
            val sum = pay
            println("Сумма перевода $sum")
        }

    }






}