package racingcar

import camp.nextstep.edu.missionutils.Randoms
import org.assertj.core.data.Index

class RacingCar(private val cars: List<String>, private val num: Int) {

    private val counts: IntArray = IntArray(cars.size)

    init {
        require(cars.all { it.length in 1..5 }) {
            "[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다."
        }

        require(cars.distinct().size == cars.size) {
            "[ERROR] 자동차 이름이 중복되면 안 됩니다."
        }
    }

    fun race() {
        var check = true
        while (check) {
            for ((index, car) in cars.withIndex()) {
                printNow(car, counts[index])
                check = move(index, check)
                print("\n")
            }
            print("\n")
        }
    }

    fun printNow(car: String, num: Int) {
        print(car + " : ")
        for (i in 1..num)
            print("-")
    }

    fun move(index: Int, check: Boolean): Boolean {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            print("-")
            if (++counts[index] == num)
                return false
        }
        return check
    }
}