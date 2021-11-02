package ss4_lop_va_doi_tuong_trong_java.bai_tap;

class XayDungLopFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    XayDungLopFan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isOn() {
        return on;
    }

    public void setSpeed(int speed) {
        this.speed = this.SLOW;
        this.speed = this.MEDIUM;
        this.speed = this.FAST;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        if (!this.on) {
            return "Color: " + this.color + ",Radius: " + this.radius + ", fan is off";
        } else {
            return "Speed: " + this.speed + ",Radius: " + this.radius + ", fan is on";
        }
    }
}
