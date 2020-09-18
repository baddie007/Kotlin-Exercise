package excercise

fun main(args: Array<String>) {

    print("Enter the year:  ")
    val year = (readLine() ?: "0").toInt()
    var result = "Ordinary"
    println("Checking for year $year ...")

    //Checking
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                result = "Leap"
        } else
            result = "Leap"
    }


    println("Entered year $year is $result year.")
}