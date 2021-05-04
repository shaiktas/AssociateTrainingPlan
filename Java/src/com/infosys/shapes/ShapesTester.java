package com.infosys.shapes;

public class ShapesTester {
    public static void main(String[] args) {
        Circle circle = new Circle( "Blue", false, 10.0);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("Black", true, 15.0, 20.0);
        System.out.println(rectangle.toString());
    }
}




