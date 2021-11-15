package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Colorable{
    double size=1;
    public Square() {
    }

    public Square(double side) {
        this.size=side;
    }

    public Square(double size, String color, boolean filled) {
        super( color, filled);
        this.size=size;
    }
    public  double getArea() {
        return Math.pow(size,2);
    }
    public double getParameter(){
        return size*4;
    }

    public double getSide() {
        return this.size;
    }

    public void setSide(double size) {
        this.size=size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
    }
    @Override
    public void howtoColor() {
        System.out.println(" Color all four sides..");
    }
}
