package tinkoff



fun main(){
    val firstStr = readln().split(" ").map { it.toInt() }
    val secondStr = readln().split(" ").map { it.toInt() }
    val x2 = if (firstStr[2]>secondStr[2]) firstStr[2] else secondStr[2]
    val x1 = if (firstStr[0]<secondStr[0]) firstStr[0] else secondStr[0]
    val y2 = if (firstStr[3]>secondStr[3]) firstStr[3] else secondStr[3]
    val y1 = if (firstStr[1]<secondStr[1]) firstStr[1] else secondStr[1]
    if (x2-x1>y2-y1) println((x2-x1)*(x2-x1))
    else println((y2-y1)*(y2-y1))
}