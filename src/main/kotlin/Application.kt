package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val input = Console.readLine().trim()

    println("시도할 횟수는 몇 회인가요?")
    val num = getValidNum()

    val cars = input.split(",")
    RacingCar(cars, num).race()
}

fun getValidNum(): Int {
    val num: Int
    try {
        num = Console.readLine().trim().toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("[ERROR] 정수가 아닙니다")
    }
    if (num < 1) throw IllegalArgumentException("[ERROR] 1이상인 정수가 아닙니다")
    return num
}