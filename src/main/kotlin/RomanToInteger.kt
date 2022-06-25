fun main(){
    val inputString = readln()
    val hashMap = hashMapOf(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000
    )
    var step = inputString.length-1
    var resultInt = 0
    while (step>=0){
        if (step==0){
            resultInt+=hashMap[inputString[0].toString()]!!
        }
        else {

            if (hashMap[inputString[step - 1].toString()]!! < hashMap[inputString[step].toString()]!!) {
                resultInt += hashMap[inputString[step].toString()]!! - hashMap[inputString[step - 1].toString()]!!
                step -= 2
            } else {
                resultInt += hashMap[inputString[step].toString()]!!
                step--
            }
        }
    }
    println(resultInt)

}

