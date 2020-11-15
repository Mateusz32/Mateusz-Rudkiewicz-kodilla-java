package com.kodilla.testing.shape;
import java.util.List;

public class ShapeCollector {

    private List<Shape> list;
    private List<Shape> thelist;

    ShapeCollector(List<Shape> list){
        this.list=list;
    }

    List<Shape> addFigure(Shape shape){
        list.add(shape);
        return list;
       // return null;
    }

    List<Shape> removeFigure(Shape shape){
       list.remove(shape);
       return list;
       // return null;
    }

    String getFigure(int n){
        return list.get(n).getShapeName();
       // return null;
    }

    String showFigures() {
        String text ="";
        //System.out.print("All figures are: ");
        for (int i = 0; i < list.size(); i++) {
            text +=list.get(i).getShapeName()+" ";
            //System.out.print(list.get(i)+" ");
        }
       // System.out.println();
        return text ;
       // return null;
    }
}
