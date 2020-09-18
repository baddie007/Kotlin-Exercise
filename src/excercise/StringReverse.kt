package excercise

fun main(args: Array<String>) {

    print("Enter the String:  ")
    val inp= readLine()?: ""
    val charArray=inp.toCharArray()
    val res = arrayListOf<Char>()
    for (i in charArray.size-1 downTo 0)
        res.add(charArray[i])
    println("The Reversed String is .. ${String(res.toCharArray())}")
}