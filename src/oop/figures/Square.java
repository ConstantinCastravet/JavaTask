package oop.figures;

public class Square extends GraphicObject {
    private double line;

    public Square(double line) throws Exception {
        setLine(line);
    }


    public double perimeter() {
        return getLine() * 4;
    }

    public double area() {
        return getLine() * getLine();
    }


    public double getLine() {
        return line;
    }

    public void setLine(double line) throws Exception {
        if (line < 0) {
            throw new IllegalArgumentException("Wrong size");
        }
        this.line=line;
    }
}
