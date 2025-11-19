package racingcar

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class RacingCarTest {
    @Test
    fun 예외() {
        assertThatThrownBy { RacingCar(listOf("magma", "magma49")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다.")
    }
}