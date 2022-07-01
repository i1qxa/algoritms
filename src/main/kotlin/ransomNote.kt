fun main(){
    val ransomNote = readln()
    val magazine = readln()
    println(canConstruct(ransomNote,magazine))
}
fun canConstruct(ransomNote:String, magazine:String ):Boolean{
    var indexOfMagazine = 0
    val magazineList = magazine.split("").toMutableList()
    repeat(ransomNote.length) {
        indexOfMagazine = magazineList.indexOf(ransomNote[it].toString())
        if (indexOfMagazine == -1) return false
        else {
            magazineList.removeAt(indexOfMagazine)
        }
    }
    return true
}
