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
class ComponentBTest {

    @InjectMocks
    private ComponentB componentB;

    @Mock
    Logger logger;

    @Test
    void testComponentB_full() {

        // given // when
        componentB.actionC();
        componentB.actionD();
        componentB.actionWarn();
        componentB.actionError();

        // then
        verify(logger, Mockito.times(2)).info("Aasdsadsadsa");
        verify(logger).warn("Warning");
        verify(logger).error("Error");
    }
}