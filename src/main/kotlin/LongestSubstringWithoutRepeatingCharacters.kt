fun main(){
    val s = Solution5()
    println(s.lengthOfLongestSubstring("abcabcbb"))
}
class Solution5 {
    fun lengthOfLongestSubstring(s: String): Int {
        var counter = 0
        var subCounterEnd:Int
        var answer = 1
        var tempLength:Int
        val tempSet = mutableSetOf<Char>()
        var subString:String
        if (s.isEmpty()) answer = 0
        if (s.length > 1) {
            while (counter < s.length) {
                tempLength = 1
                subCounterEnd = counter+1
                if (subCounterEnd<s.length){
                    subString = s.substring(counter..subCounterEnd)
                    tempSet.clear()
                    tempSet.addAll(subString.toSet())
                    if(tempSet.size<subString.length) counter++
                    else{
                        tempLength++
                        subCounterEnd++
                        while (subCounterEnd<s.length && !tempSet.contains(s[subCounterEnd])) {
                            tempSet.add(s[subCounterEnd])
                            tempLength++
                            subCounterEnd++
                        }
                        if (tempLength>answer)answer=tempLength
                        counter++
                    }
                }
                else counter++

            }
        }
        return answer
    }
}

