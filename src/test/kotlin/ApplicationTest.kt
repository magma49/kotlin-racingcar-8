package racingcar

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import camp.nextstep.edu.missionutils.test.NsTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy

import org.junit.jupiter.api.Test

internal class ApplicationTest : NsTest() {

    @Test
    fun 기능() {
        assertSimpleTest {
            run("hi","2")
            assertThat(output()).contains("hi","2")
        }
    }

    @Test
    fun 예외() {
        assertSimpleTest {
            assertThatThrownBy { runException("") }
                .isInstanceOf(IllegalArgumentException::class.java)
        }
    }

    override fun runMain() {
        main()
    }
}