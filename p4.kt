fun main() 
{
    val str = "maruti suzuki"
    for (i in str) 
    {
        var count = 0
        for (j in str)
        {
            if (j == i)
            {
                count++
            }
        }
        println("$i  $count")
    }
}
