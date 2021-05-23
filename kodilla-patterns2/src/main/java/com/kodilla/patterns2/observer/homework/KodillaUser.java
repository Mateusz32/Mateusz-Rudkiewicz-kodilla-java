package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class KodillaUser implements ObservalbeHomerwork {

    private final String name;
    private final List<ObserverHomework> observersHomework;
    private final Deque<String> homework;

    public KodillaUser(String name) {
        this.name = name;
        observersHomework = new ArrayList<>();
        homework = new ArrayDeque<>();
    }

    public void addHomework(String module) {
        homework.offer(module);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomework observerHomework) {
        observersHomework.add(observerHomework);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomework observerHomework : observersHomework) {
            observerHomework.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomework observerHomework) {
        observersHomework.remove(observerHomework);
    }

    public String getName() {
        return name;
    }

    public List<ObserverHomework> getObserversHomework() {
        return observersHomework;
    }

    public Deque<String> getHomework() {
        return homework;
    }
}
