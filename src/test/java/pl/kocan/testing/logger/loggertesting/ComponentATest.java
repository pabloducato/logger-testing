package pl.kocan.testing.logger.loggertesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ComponentATest {

    @InjectMocks
    private ComponentA componentA;

    @Mock
    Logger logger;

    @Test
    void testMethodA() {

        // given // when
        componentA.actionA();
        componentA.actionB();

        // then
        verify(logger, Mockito.times(1)).info("Aasdsadsadsa1");
    }

    @Test
    void testMethodA_full() {

        // given
        componentA.actionA();
        componentA.actionB();

        // when // then
        verify(logger, Mockito.times(1)).info("Aasdsadsadsa1");
        verify(logger, Mockito.times(1)).info("Aasdsadsadsa2");
    }
}