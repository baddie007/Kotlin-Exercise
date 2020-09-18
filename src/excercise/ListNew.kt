package excercise

fun main(args: Array<String>) {
    print("Enter the number of elements for List A:  ")
    val inpA= readLine()?.toInt()
    print("Enter the number of elements for List B:  ")
    val inpB= readLine()?.toInt()
    val arrA= mutableListOf<Int>()
    val arrB= mutableListOf<Int>()
    println("Enter elements of List A:  ")
    for (i in 1..inpA!!)
        readLine()?.toInt()?.let { arrA.add(it) }
    println("Enter elements of List B:  ")
    for (i in 1..inpB!!)
        readLine()?.toInt()?.let { arrB.add(it) }

    println(checkListNew(arrA,arrB))
}

fun checkListNew(l1: List<Int>,l2: List<Int>): String{
    if(l1.size>=l2.size){
        if(l1.size==l2.size){
            if(l1.containsAll(l2) && l2.containsAll(l1))
                return "A is equal to B"
        }
        else if(l1.containsAll(l2))
            return "A is a superlist of B"
    }
    else if(l2.containsAll(l1))
        return  "A is a sublist of B"
    return "A is not a superlist of, sublist of or equal to B"
}