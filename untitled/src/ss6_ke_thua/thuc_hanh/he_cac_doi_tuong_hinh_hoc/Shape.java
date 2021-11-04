package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Shape {
    String color;
    boolean filled;

    Shape() {
        color = "green";
        filled = true;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

class Circle extends Shape {
    private double radius = 1.0;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius=radius;
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
    public  double getArea(){
        return this.radius*2*Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", area="
                + getArea()
                +", perimeter="
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
class Rectangle extends Shape{
    private double width=1.0,length=1.0;
    Rectangle(){
    }
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", area="
                + getArea()
                + ", perimeter"
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }
}
 class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}


