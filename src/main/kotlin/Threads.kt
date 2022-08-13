fun main() {
    var a = 0
    var b = 0
    val lock = Any()
    val thread1 = Thread {
        synchronized(lock) {
            a = 1

        }
    }
    val thread2 = Thread {
        synchronized(lock) {
            b = 1

        }
    }
    thread1.start()
    thread2.start()
    thread1.join()
    thread2.join()
    synchronized(lock){
        println(a)
        println(b)
    }

    


}