package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + " of " + color + " to paint " + whatToPaint);
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskDone;
        if (color == null || whatToPaint == null) {
            taskDone = false;
        } else {
            taskDone = true;
        }
        return taskDone;
    }

    public String getColor() {
        return color;
    }
}
