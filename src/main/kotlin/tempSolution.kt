fun main(){
    val solution = Solution6()
    println(solution.threeSum(intArrayOf(-4,-8,7,13,10,1,-14,-13,0,8,6,-13,-5,-4,-12,2,-11,7,-5,0,-9,-14,-8,-9,2,-7,-13,-3,13,9,-14,-6,8,1,14,-5,-13,8,-10,-5,1,11,-11,3,14,-8,-10,-12,6,-8,-5,13,-15,2,11,-5,10,6,-1,1,0,0,2,-7,8,-6,3,3,-13,8,5,-5,-3,9,5,-4,-14,11,-8,7,10,-6,-3,11,12,-14,-9,-1,7,5,-15,14,12,-5,-8,-2,4,2,-14,-2,-12,6,8,0,0,-2,3,-7,-14,2,7,12,12,12,0,9,13,-2,-15,-3,10,-14,-4,7,-12,3,-10)))
}
class SolutionTemp {
    val answerList = mutableListOf<List<Int>>()
    fun threeSum(nums: IntArray): List<List<Int>> {
        var counterFirstNum = 0
        var counterSecondNum:Int
        var counterThirdNum:Int

        while (counterFirstNum in nums.indices){
            counterSecondNum = counterFirstNum+1
            while (counterSecondNum in nums.indices){
                counterThirdNum = counterSecondNum+1
                while (counterThirdNum in nums.indices){
                    addListInAnswerList(
                        listOf(
                            nums[counterFirstNum],nums[counterSecondNum],nums[counterThirdNum]
                        )
                    )
                    counterThirdNum++
                }
                counterSecondNum++
            }
            counterFirstNum++
        }
        return answerList
    }
    fun addListInAnswerList(list:List<Int>){
        if (list.sum()==0 && !answerList.contains(list)) answerList.add(list)
    }
}