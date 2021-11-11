package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public double getArea() {
        return (this.radius * 2 * Math.PI);
    }

    public double getPerimeter() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", area="
                + getArea()
                + ", perimeter="
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
