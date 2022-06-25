fun main(){
    val inputString = readln().split("").map { romanToIntegerChar(it) }
    var step = inputString.size -1
    var resultInt = 0
    while (step>0){
        if(inputString[step-1]<inputString[step]){
            resultInt+=inputString[step]-inputString[step-1]
            step-=2
        }
        else{
            resultInt+=inputString[step]
            step--
        }
    }
    println(resultInt)

}
fun romanToIntegerChar(input:String):Int{
    return when(input){
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }
}
