//1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 c를 선언한다
//        단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다

var a: Int = 10
var b: Int = 10
var c: Boolean = if (a == b) true else false
println(c)

//2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다

var a: Int = 10
var b: Int = a * 2

//3.학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//        (90 점 이상 A학점, 80~89 점은 B학점, 70~79 점은 C학점, 그렇지 않으면 F학점)

fun grade(score: Int): String {
    when (score) {
        in 90..100 -> return "A학점"
        in 80..89 -> return "B학점"
        in 70..79 -> return "C학점"
        else -> return "F학점"
    }
}

val result: String = grade(80)
println(result)

//4.학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수 (정수) 를 반환하는 함수를 만드시오
//(시험 문제는 총 20 문제이고 만점은 100 점)

//방법 1`
fun gradeTest(correctCount:Int) : Int {
    val result: Int = correctCount * 5
    return result
}
println(gradeTest(10))

//방법 2
fun gradeTest2(correctCount:Int): Int = correctCount * 5

println(gradeTest2(10))


//5.nullable 정수형 두개를 받는 함수를 만든다 . 이 함수는 받은 인수의 합을 반환한다
//이때 인수중에 null 이 있으면 0 으로 취급하여 합을 구한다

fun plustTwoNumbers(firstNum: Int?, secondNum: Int?): Int {
    // 함수에서 받은 인자 firstNum, secondNum -> val 이다
//    if (firstNum == null) {
//        firstNum = 0
//    }
//    if (secondNum == null) {
//        secondNum = 0
//    }
//    return firstNum + secondNum

    // 정답
    val first: Int = if (firstNum == null) 0 else firstNum
    val second: Int = if (secondNum == null) 0 else secondNum
    return first + second

//    val firstNum :Int? =  if (firstNum == null) 0 else firstNum
//    val secondNum :Int? =  if (secondNum == null) 0 else secondNum
//    return first + second
    // 함수안에서 똑같은 이름을 갖고 있는 다른 두 변수가 있으면 안된다
}
println(plustTwoNumbers(null, null))