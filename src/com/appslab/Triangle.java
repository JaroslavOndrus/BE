package com.appslab;

public class Triangle {
    private int Side1;
    private int Side2;
    private int Side3;

    public Triangle(int side1, int side2, int side3) {
        Side1 = side1;
        Side2 = side2;
        Side3 = side3;
    }

    public int getSide1() {
        return Side1;
    }

    public int getSide2() {
        return Side2;
    }

    public int getSide3() {
        return Side3;
    }

    public int GetPerimeter(){
         return Side1+Side2+Side3;
    }

    public int GetArea(){
        return Side1*Side2*Side3;
    }
}
