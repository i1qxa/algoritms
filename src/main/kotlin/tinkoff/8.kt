package tinkoff


fun main() {
    val options = readln().split(" ").map { it.toInt() }
    val countOfDomens = options[0]
    val countOfBuyers = options[1]
    val listOfDomens = mutableListOf<String>()
    var currentCount: Int
    val answerList = mutableListOf<Int>()
    var regexStr = ""
    repeat(countOfDomens) {
        listOfDomens.add(readln())
    }
    repeat(countOfBuyers) {
        currentCount = 0
        regexStr = strToRegex(readln())
        listOfDomens.forEach() {
            if (it.contains(Regex("""$regexStr"""))) currentCount += 1
        }
        answerList.add(currentCount)
        currentCount = 0
    }
    answerList.forEach() {
        println(it)
    }
}

fun strToRegex(s: String): String {
    var answer = ""
    s.forEach {
        if (it != ' ') answer += it
        else answer += ("[STAR].*")
    }
    return answer
}