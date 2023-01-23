package pl.kocan.testing.logger.loggertesting;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
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
