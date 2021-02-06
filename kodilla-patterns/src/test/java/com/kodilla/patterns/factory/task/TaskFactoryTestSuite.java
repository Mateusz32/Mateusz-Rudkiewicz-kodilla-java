package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoopingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Buy bread", shoopingTask.getTaskName());
        assertEquals(true, shoopingTask.isTaskExecuted());
        shoopingTask.executeTask();
    }

    @Test
    void testFactorDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("Buy car", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
    }

    @Test
    void testFactorPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("Buy paint", paintingTask.getTaskName());
        assertEquals(false, paintingTask.isTaskExecuted());
    }
}
