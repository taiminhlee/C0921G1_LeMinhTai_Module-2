package ss5_access_modifier_static_method_static_propery.bai_tap.access_modifier;

public class Circle {
    private double radius=1.0;
    private String color ="red";
    Circle(){}
    Circle(double r){
        this.radius=r;
    }

    protected double getRadius() {
        return radius;
    }


    protected double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
}

