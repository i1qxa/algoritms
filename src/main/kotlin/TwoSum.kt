fun main(){
    val inputArray = readln().split(",").map { it.toInt() }
    val target = readln().toInt()
    var i =0
    var isFinished = false
    while (!isFinished){
        if (target-2*inputArray[i]!=0 && inputArray.contains(target-inputArray[i])){
            var result = arrayOf(i, inputArray.indexOf(target-inputArray[i]))
            //println("$i, ${inputArray.indexOf(target-inputArray[i])}")
            println("${result[0]} + ${result[1]}")
            isFinished = true

        }
        else i++
    }
}