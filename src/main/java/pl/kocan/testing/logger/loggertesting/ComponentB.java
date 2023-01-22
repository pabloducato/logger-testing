package pl.kocan.testing.logger.loggertesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ComponentB {

    private void actionC() {
        log.info("Aasdsadsadsa");
    }

    private void actionD() {
        log.info("Aasdsadsadsa");
    }
}
