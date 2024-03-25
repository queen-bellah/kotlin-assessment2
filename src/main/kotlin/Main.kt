fun main() {
arrayfunction(arrayOf(1,2,3,4,5,6,7))
    volumeofsphere(6.0)
   println(checkPanidrome("madams"))

}
//question1
fun givenString(sentence:String){
    sentence.forEach { x:Char

    }
}

//question2
fun arrayfunction(numbers:Array<Int>):Int {
    var sum = 0

    numbers.forEach { x ->

        sum += x


    }
    println(sum)

    var counting = numbers.count()
    var ave = sum / counting
    println(counting)
    println(ave)
    return sum
    return ave
    return counting

}
//question3
fun volumeofsphere(r:Double){
    var v=4/3 * 3.14159 * r * r * r
    println(v)
}
//question4
fun checkPanidrome(word:String):Boolean{
    var check=word.reversed()
    if (word== check){
        return true
    }
    else{
       return false
    }
}

