package domain.operations.simple;

public class SimpleOperations {


    private double a;
    private double b;

    public SimpleOperations() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return a+b;
    }

    public double sub() {
        return a - b;
    }

    public double mul() {
        return a * b;
    }

    public double div() {
        return a / b;
    }

}