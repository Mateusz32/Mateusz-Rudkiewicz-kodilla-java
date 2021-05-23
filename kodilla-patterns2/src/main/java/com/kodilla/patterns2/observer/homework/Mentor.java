package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomework{
   private final String name;
   private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(KodillaUser kodillaUser) {
        System.out.println(name + ": New homework was sent from: " + kodillaUser.getName() + "\n" +
                " (total: " + kodillaUser.getHomework().size() + " homework)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
