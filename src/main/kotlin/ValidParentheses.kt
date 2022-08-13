fun main() {
    var a = Solution()
    println(a.isValid("()"))
}

class Solution {
    fun isValid(s: String): Boolean {
        var mutableString = s
        var oldStringSize = mutableString.length
        var keepReplace = true
        while (keepReplace) {
            mutableString = mutableString.replace("[]", "")
                .replace("{}", "")
                .replace("()", "")
            if (mutableString.length == oldStringSize) {
                keepReplace = false
            }
            oldStringSize = mutableString.length
        }
        return mutableString.isEmpty()
    }
}

