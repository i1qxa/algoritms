package tinkoff

fun main(){
    readln()
    var minPlus:Int? = null
    var maxMinus:Int? = null
    var sum = 0
    var switcher = true
    readln().map {
        if (switcher){
            sum+=it.toString().toInt()
            if(minPlus==null)minPlus = it.toString().toInt()
            else if (it.toString().toInt()<minPlus!!)minPlus = it.toString().toInt()
        }
        else{
            sum-=it.toString().toInt()
            if (maxMinus==null)maxMinus=-it.toString().toInt()
            else if (maxMinus!!>-it.toString().toInt()) maxMinus = -it.toString().toInt()
        }
        switcher=!switcher
    }
    println(sum - (2*minPlus!!) - (2*maxMinus!!) )
}