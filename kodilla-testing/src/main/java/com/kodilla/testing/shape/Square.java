package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    String field;

    Square (String name,String field){
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
