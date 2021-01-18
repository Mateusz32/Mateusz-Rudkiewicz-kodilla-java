package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Do shopping";
        String taskInProgress = "Clean flat";
        String taskDone = "Do relax";
        board.getToDoList().getTask().add(taskToDo);
        board.getInProgressList().getTask().add(taskInProgress);
        board.getDoneList().getTask().add(taskDone);

        //Then
        Assert.assertEquals(taskToDo, board.getToDoList().getTask().get(0));
        Assert.assertEquals(taskInProgress, board.getInProgressList().getTask().get(0));
        Assert.assertEquals(taskDone, board.getDoneList().getTask().get(0));
    }
}
