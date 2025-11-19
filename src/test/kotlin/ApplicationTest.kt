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
            run("pobi,woni,jun", "2")
            assertThat(output()).contains("[pobi, woni, jun]", "2")
        }
    }

    @Test
    fun 예외_시도할_횟수가_1이상인_정수가_아닐_때() {
        assertSimpleTest {
            assertThatThrownBy { runException("pobi,woni,jun", "0") }
                .isInstanceOf(IllegalArgumentException::class.java)
                .hasMessageContaining("[ERROR] 잘못된 입력: 1이상인 정수가 아닙니다")
        }
    }

    @Test
    fun 예외_시도할_횟수가_숫자가_아닐_때() {
        assertSimpleTest {
            assertThatThrownBy { runException("pobi,woni,jun", "a") }
                .isInstanceOf(IllegalArgumentException::class.java)
                .hasMessageContaining("[ERROR] 잘못된 입력: 정수가 아닙니다")
        }
    }

    override fun runMain() {
        main()
    }
}