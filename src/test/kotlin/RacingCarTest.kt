package racingcar

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class RacingCarTest {
    @Test
    fun 예외() {
        assertThatThrownBy { RacingCar(listOf("magma","magma49")) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}