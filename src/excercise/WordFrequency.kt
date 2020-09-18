package excercise

import java.util.*


fun main(args: Array<String>) {

    print("Enter the String:  ")
    val inp= readLine()?: ""
    val list= inp.split(' ')
    val count= mutableListOf<Int>()
    if (list.isNotEmpty()){
        for (each in list.distinct())
            count.add(Collections.frequency(list,each))
        println(list.distinct().zip(count))
    }
}