package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name;
    String field;

    Circle (String name,String field){
        this.name=name;
        this.field=field;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public String getField() {
        return field;
    }

}


