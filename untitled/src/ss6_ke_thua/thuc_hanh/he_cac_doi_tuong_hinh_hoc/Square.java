package ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Square extends Shape {
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

    public double getSide() {
        return this.size;
    }

    public void setSide(double size) {
       this.size=size;
    }

    @Override
    public  double getArea() {
        return Math.pow(size,2);
    }
    public double getParameter(){
        return size*4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide();
    }
}
