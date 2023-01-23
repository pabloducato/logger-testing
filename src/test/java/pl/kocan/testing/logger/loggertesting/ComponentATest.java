package pl.kocan.testing.logger.loggertesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
class ComponentATest {

    private final ComponentA componentA = new ComponentA();

    @Test
    void testMethodA(CapturedOutput output) {

        // given // when
        componentA.actionA();
        componentA.actionB();

        // then
        List<String> list = getLogs(output);
        assertThatLogs(list, list.size(), "Aasdsadsadsa1", "Aasdsadsadsa2");
    }

    @Test
    void testMethodA_full(CapturedOutput output) {

        // given
        componentA.actionA();
        componentA.actionB();

        // when // then
        List<String> list = getLogs(output);
        assertThatLogs(list, list.size(), "Aasdsadsadsa1", "Aasdsadsadsa2");
    }

    private List<String> getLogs(CapturedOutput output) {
        return Arrays.stream(output.getOut().split("\r\n")).toList();
    }

    private void assertThatLogs(List<String> list, int size, String... values) {
        assertThat(list)
                .hasSize(size)
                .containsExactly(values);
    }
}