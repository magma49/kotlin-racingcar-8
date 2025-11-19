package racingcar

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class RacingCarTest {
    @Test
    fun 예외_자동차_이름이_범위를_벗어날_때() {
        assertThatThrownBy { RacingCar(listOf("magma", "magma49")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("[ERROR] 모든 자동차 이름은 5글자 이하여야 합니다.")
    }

    @Test
    fun 예외_자동차_이름이_중복될_때() {
        assertThatThrownBy { RacingCar(listOf("magma", "magma")) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessageContaining("[ERROR] 자동차 이름이 중복되면 안 됩니다.")
    }
}