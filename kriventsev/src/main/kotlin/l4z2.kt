import kotlin.random.Random
fun main()
{
    val random = Random
    var bals=0
    val mish1 = random.nextInt(0, 2)
    val mish2 = random.nextInt(0, 2)
    val mish3 = random.nextInt(0, 2)
    if (mish1==1)
    {
        println("1 Попал")
        bals++
    }
    else
    {
        println("1 не опал")

    }
    if (mish2==1)
    {
        println("2 Попал")
        bals++
    }
    else
    {
        println("2 не опал")

    }
    if (mish3==1)
    {
        println("3 Попал")
        bals++
    }
    else
    {
        println("3 не опал")
    }
    println("Кол-во баллов $bals ")

}