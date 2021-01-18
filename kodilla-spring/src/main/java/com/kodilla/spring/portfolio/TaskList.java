package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> task;

    public TaskList() {
        task = new ArrayList<>();
    }

    public List<String> getTask() {
        return task;
    }
}