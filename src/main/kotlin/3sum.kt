fun main() {
    val solution = Solution6()
    println(solution.threeSum(intArrayOf(-1,0,1,2,-1,-4)))
}

class Solution6 {
    val answerList = mutableListOf<List<Int>>()
    fun threeSum(nums: IntArray): List<List<Int>> {
        var counterSecondNum: Int
        var counterThirdNum: Int
        val sortedNums = nums.sorted()
        var currentList: List<Int>
        for (counterFirstNum in 0..sortedNums.size-2 step 1){
            if (counterFirstNum>0 && sortedNums[counterFirstNum] == sortedNums[counterFirstNum-1]){
                continue
            }
            counterSecondNum = counterFirstNum+1
            counterThirdNum = sortedNums.size-1
            while (counterSecondNum<counterThirdNum){
                currentList = listOf(
                    sortedNums[counterFirstNum],
                    sortedNums[counterSecondNum],
                    sortedNums[counterThirdNum]
                )
                if (currentList.sum() == 0) {
                    answerList.add(currentList)
                    counterThirdNum--
                    while (counterSecondNum<counterThirdNum && sortedNums[counterThirdNum] == sortedNums[counterThirdNum+1]){
                        counterThirdNum--
                    }
                }
                else if (currentList.sum()>0) counterThirdNum--
                else counterSecondNum++
            }

        }
        return answerList
    }

}