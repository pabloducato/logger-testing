package pl.kocan.testing.logger.loggertesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ComponentB {

    protected void actionC() {
        log.info("Aasdsadsadsa");
    }

    protected void actionD() {
        log.info("Aasdsadsadsa");
    }

    protected void actionWarn() {
        log.warn("Warning");
    }

    protected void actionError() {
        log.error("Error");
    }
}
