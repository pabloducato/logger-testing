package pl.kocan.testing.logger.loggertesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ComponentA {

    protected void actionA() {
        log.info("Aasdsadsadsa1");
    }

    protected void actionB() {
        log.info("Aasdsadsadsa2");
    }
}
