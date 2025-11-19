package racingcar

class RacingCar(private val numbers: List<String>) {
    init {
        require(numbers.all { it.length in 1..5 }) {
            "[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다."
        }
    }
}