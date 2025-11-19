package racingcar

class RacingCar(private val numbers: List<String>) {
    init {
        require(numbers.all { it.length in 1..5 }) {
            "[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다."
        }

        require(numbers.distinct().size == numbers.size) {
            "[ERROR] 자동차 이름이 중복되면 안 됩니다."
        }
    }
}