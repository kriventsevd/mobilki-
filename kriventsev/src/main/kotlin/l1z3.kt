fun main() {
    val sum:Int = 15000
    val skid: Int = 100
    val procent: Double=0.05
    if (sum<=1000) {
println("Стоимость $sum")
    }
    else if (sum >1000 && sum<=10000)
    {
        val sroim=sum-skid
        println("Стоимость $sroim")
    }
    else
    {
        val cena = sum-(sum*procent)
        println("Стоимость $cena")
    }
}