package com.kodilla.patterns.singleton;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
     static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");

    }

    @AfterAll
     static void closeSettingsFile() {
        settingsFileEngine.close();
    }

    @Test
    public void testGetFileName() {
        //Given
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
        //When
        String fileName = settingsFileEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    public   void testLoadSettings() {
        //Given
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
  public  void testSaveSettings() {
        //Given
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        assertTrue(result);
    }
}
