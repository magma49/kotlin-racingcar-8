package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val input: String = Console.readLine().trim()

    println("시도할 횟수는 몇 회인가요?")
    val num: Int = getValidNum()

    val cars: List<String> = input.split(",")
    RacingCar(cars, num).race()
}

fun getValidNum(): Int {
    val num: Int
    try {
        num = Console.readLine().trim().toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("[ERROR] 정수만 입력해주세요.")
    }
    require(num > 0) { "[ERROR] 1이상인 정수만 입력해주세요." }
    return num
}