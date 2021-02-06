package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void executeTask() {
        System.out.println("Buy: " + whatToBuy + ", quantity: " + quantity);
    }

    @Override
    public boolean isTaskExecuted() {
        boolean taskDone;
        if (whatToBuy == null || quantity == 0) {
            taskDone = false;
        } else {
            taskDone = true;
        }
        return taskDone;
    }
}
