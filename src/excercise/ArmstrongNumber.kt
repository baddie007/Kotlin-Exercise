package excercise

fun main(args: Array<String>) {

    print("Enter the number:  ")
    val inp = (readLine() ?: "0")
    var num=inp.toLong()
    var result = "NOT"
    var checknum: Long=0
    println("Checking for number $num ...")

    while(num/10 >0) {
        checknum +=  num % 10 pow inp.length; num /= 10
    }
    checknum+=num pow inp.length

    if (checknum == inp.toLong())
        result=""

    println("$inp is $result a Armstrong Number")
}


infix fun Long.pow(exponent: Int) : Long{
    var res = 1L;
    for(i in exponent downTo 1)
        res *= this
    return res;
}
