package exending;

abstract public class TwoDShape {
    private double width;
    private double height;
    private String name;

    public TwoDShape() {
        name = "none";
        width = height = 0;
    }

    public TwoDShape(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public TwoDShape(String name, double size) {
        this.name = name;
        width = height = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }

    abstract double area();
}

class Circle extends TwoDShape {
    
    public Circle() {
    }

    public Circle(String name, double size) {
        super(name, size);
    }

    @Override
    double area() {
        return 2 * Math.PI * getWidth();
    }

}
