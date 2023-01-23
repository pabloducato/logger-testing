package pl.kocan.testing.logger.loggertesting;

import org.springframework.boot.test.system.CapturedOutput;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComponentUtil {

    protected static void assertThatLogs(List<String> list, int size, String... values) {
        assertThat(list)
                .hasSize(size)
                .containsExactly(values);
    }

    protected static List<String> getLogs(CapturedOutput output) {
        return Arrays.stream(output.getOut().split("\r\n")).toList();
    }
}
