package proj;

public class Romb {
    private double Base;
    private double height;
    private static int numberOfObjects = 0;

    public Romb() {
        this (1, 1);
    }

    public Romb(double height, double Base) {
        this.height = height;
        this.Base = Base;

        numberOfObjects++;
    }

    public Romb(double Base) {
        this (1, Base);
        numberOfObjects++;
    }


    public double getBase() {
        return this.Base;
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea() {
        return this.Base * this.height;
    }

    public void setHeight(double height) {this.height = height;}

    public void setBase(double width) {this.Base = width;}



    public double getPerimeter() {
        return this.Base * 4;
    }

}