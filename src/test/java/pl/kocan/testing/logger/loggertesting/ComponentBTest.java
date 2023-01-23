package pl.kocan.testing.logger.loggertesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
class ComponentBTest {

    private final ComponentB componentB = new ComponentB();

    @Test
    void testComponentB_full(CapturedOutput output) {

        // given // when
        componentB.actionC();
        componentB.actionD();
        componentB.actionWarn();
        componentB.actionError();

        // then
        List<String> list = Arrays.stream(output.getOut().split("\r\n")).toList();
        assertThat(list)
                .hasSize(list.size())
                .containsExactly("Aasdsadsadsa", "Aasdsadsadsa", "Warning", "Error");
    }
}