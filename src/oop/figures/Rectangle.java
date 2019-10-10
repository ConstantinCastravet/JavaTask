package oop.figures;

public class Rectangle extends Square {
    private double newLine;

    public Rectangle(double line, double newLine) throws Exception {
        super(line);
        setNewLine(newLine);
    }

    @Override
    public double area() {
        return this.getLine() * getNewLine();
    }

    public double getNewLine() {
        return newLine;
    }

    public void setNewLine(double newLine) throws Exception {
        if (newLine < 0)
            throw new IllegalAccessException("Wrong size");
        this.newLine = newLine;
    }
}
