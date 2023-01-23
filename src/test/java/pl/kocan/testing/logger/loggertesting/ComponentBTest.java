package pl.kocan.testing.logger.loggertesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import java.util.List;

import static pl.kocan.testing.logger.loggertesting.ComponentUtil.assertThatLogs;
import static pl.kocan.testing.logger.loggertesting.ComponentUtil.getLogs;

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
        List<String> list = getLogs(output);
        assertThatLogs(list, list.size(), "Aasdsadsadsa", "Aasdsadsadsa", "Warning", "Error");
    }
}
