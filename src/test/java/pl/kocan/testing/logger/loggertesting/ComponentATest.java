package pl.kocan.testing.logger.loggertesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

@ExtendWith(MockitoExtension.class)
class ComponentATest {

    @InjectMocks
    private ComponentA componentA;

    @Mock
    Logger logger;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMethodA() {
        componentA.actionA();
        componentA.actionB();

        Mockito.verify(logger, Mockito.times(1)).info("Aasdsadsadsa1");
    }

    @Test
    void testMethodA_full() {
        componentA.actionA();
        componentA.actionB();

        Mockito.verify(logger, Mockito.times(1)).info("Aasdsadsadsa1");
        Mockito.verify(logger, Mockito.times(1)).info("Aasdsadsadsa2");
    }
}