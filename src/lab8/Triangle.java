package lab8;

public class Triangle extends GraphicObject{

    //attributes
    private double h;
    private double d;





    public Triangle() {}

    public Triangle(double h, double d) {
        this.h = h;
        this.d = d;
    }

    @Override
    void findArea() {

        super.area  =0.5 * h * d;
        System.out.println("The area of tringle: "+super.area);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}
