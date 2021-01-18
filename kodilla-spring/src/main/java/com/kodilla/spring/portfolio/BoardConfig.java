package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
    @Bean
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean
    public TaskList getDoneList() {
        return new TaskList();
    }
}
