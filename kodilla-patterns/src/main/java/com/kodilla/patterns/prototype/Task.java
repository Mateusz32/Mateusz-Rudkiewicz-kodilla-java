package com.kodilla.patterns.prototype;

import java.util.Objects;

public final class Tasks {

    private final String name;

    public Tasks(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "      Task [" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks tasks = (Tasks) o;
        return Objects.equals(name, tasks.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}