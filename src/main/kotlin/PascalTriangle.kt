fun main() {
    val test = Solution4()
    println(test.generate(5))
}

class Solution4 {
    fun generate(numRows: Int): List<List<Int>> {
        val outputList = mutableListOf<List<Int>>()
        var counter = 1
        outputList.add(listOf(1))
        counter++
        if (counter <= numRows) {
            outputList.add(listOf(1, 1))
            counter++
        }
        while (counter <= numRows) {
            outputList.add(createNewListInt(outputList[counter - 2]))
            counter++
        }
        return outputList
    }
}

fun createNewListInt(listInt: List<Int>): List<Int> {
    val subAnswerList = mutableListOf<Int>()
    var subCounter = 0
    subAnswerList.add(1)
    while (subCounter < listInt.size - 1) {
        subAnswerList.add(listInt[subCounter] + listInt[subCounter + 1])
        subCounter++
    }
    subAnswerList.add(1)
    return subAnswerList
}