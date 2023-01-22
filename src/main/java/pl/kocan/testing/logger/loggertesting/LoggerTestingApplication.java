package pl.kocan.testing.logger.loggertesting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LoggerTestingApplication {

    static ComponentA componentA = new ComponentA();
    static ComponentB componentB = new ComponentB();

    public static void main(String[] args) {
        try {
            SpringApplication.run(LoggerTestingApplication.class, args);
            componentA.actionA();
            componentB.actionD();
            componentB.actionWarn();
            componentB.actionError();
        } catch (Exception ex) {
            log.info("An unexpected error occurred");
        }
    }

}
