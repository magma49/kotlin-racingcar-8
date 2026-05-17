package racingcar

import camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class RacingCarTest {
    private val MOVING_FORWARD: Int = 4
    private val STOP: Int = 3

    @Test
    fun 기능() {
        assertRandomNumberInRangeTest(
            {
                RacingCar(listOf("pobi", "woni"), 2).race()
            },
            MOVING_FORWARD, STOP, STOP, MOVING_FORWARD, MOVING_FORWARD, STOP
        )
    }

    @Test
    fun 예외_자동차_이름이_범위를_벗어날_때() {
        assertThatThrownBy { RacingCar(listOf("magma", "magma49"), 2) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다.")
    }

    @Test
    fun 예외_자동차_이름이_중복될_때() {
        assertThatThrownBy { RacingCar(listOf("magma", "magma"), 2) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("[ERROR] 자동차 이름이 중복되면 안 됩니다.")
    }
}