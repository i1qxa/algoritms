package tinkoff

fun main(){
    var isBlock = false
    val resList = mutableListOf<Int>()
    val mapOfValues = mutableMapOf<String,List<Int>>()
    var currentString:String
    var currentList:List<String>
    var value:Int
    currentString = readln()
    if (currentString == "{") isBlock = true
    else if (currentString == "}") isBlock = false
    else {
        currentList = currentString.split("=")
        if (currentList[1].equals(Int))value = currentList[1].toInt()
        else{
            if(!mapOfValues.contains(currentList[1])) {
                mapOfValues[currentList[1]] = listOf(0)
                value=0
            }
            else{
                value = mapOfValues[currentList[1]]!![0]
            }
        }

    }
}
