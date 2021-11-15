package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
   private double radius;
   private String color;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * 2 * Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "A circle radius= " +
                  radius +
                ", color= " +
                 color +
                ", area= " +
                getArea() +
                ", perimeter= " +
                getPerimeter();


    }
}


