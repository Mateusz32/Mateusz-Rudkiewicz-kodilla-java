package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy bread", "bread", 2);
            case DRIVINGTASK:
                return new DrivingTask("Buy car", "Car saloon", " driving");
            case PAINTINGTASK:
                return new PaintingTask("Buy paint", null, "house");
            default:
                return null;
        }
    }
}
