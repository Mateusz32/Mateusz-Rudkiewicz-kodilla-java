package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    static void openSettingsFile() {
        logger = Logger.INSTANCE;
        logger.log("Mati");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Mati", lastLog);
    }
}

