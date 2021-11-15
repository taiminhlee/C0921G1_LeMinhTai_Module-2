package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
        double height;

        Cylinder(double radius,double height,String color){
            super(radius, color);
            this.height=height;
        }

        @Override
        public double getRadius() {
            return super.getRadius();
        }

        public double getHeight() {
            return height;
        }

        @Override
        public String getColor() {
            return super.getColor();
        }

        @Override
        public void setRadius(double radius) {
            super.setRadius(radius);
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public void setColor(String color) {
            super.setColor(color);
        }

        @Override
        public double getArea() {
            return super.getArea();
        }
        public double getPerimeter(){
            return super.getPerimeter()*height;
        }

        @Override
        public String toString() {
            return "Cylinder radius= " +
                    this.getRadius() +
                    ", height= " +
                    height +
                    ", area= " +
                    getArea() +
                    ", perimeter= " +
                    getPerimeter();
        }
    }
