package tinkoff

fun main() {
    val listOfNames = mutableMapOf<String, Int>()
    val listOfCommand = mutableMapOf<Int,Int>()
    var countOfWin = 0
    var currentCommand = 0
    repeat(readln().toInt()) {
        readln().split(" ").map {
            if (!listOfNames.containsKey(it)) listOfNames[it] = listOfNames.size + 1
           currentCommand+=listOfNames[it]!!
        }
        if (listOfCommand.containsKey(currentCommand)) {
            countOfWin = listOfCommand[currentCommand]!!
            listOfCommand.replace(currentCommand,countOfWin,countOfWin+1)
        }
        else{
            listOfCommand[currentCommand] = 1
        }
        currentCommand = 0
    }
    var maxWin = 0
    listOfCommand.forEach(){
        if (it.value>maxWin) maxWin = it.value
    }
    println(maxWin)
}