fun main(){
    val a = Solution2()
    println(a.longestCommonPrefix(arrayOf("dog","racecar","car")))
}
class Solution2 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()||strs[0].isEmpty()) return ""
        else if (strs.size == 1) return strs[0]
        else{
            var prefix = ""
            var numOfChar = 0
            var currentChar:Char
            var flag = true
            while (flag){
                if (strs[0].length<=numOfChar) flag = false
                else{
                    currentChar = strs[0][numOfChar]
                    strs.forEach {
                        if(it.length<=numOfChar) flag = false
                        else if(it[numOfChar]!=currentChar) flag = false
                    }
                    if (flag){
                        prefix+=currentChar
                        numOfChar+=1
                    }
                }

            }
            return prefix
        }

    }
}