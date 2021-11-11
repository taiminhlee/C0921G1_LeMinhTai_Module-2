package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Rectangle;
import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Square();
        shapes[1]=new Rectangle();
        shapes[2]=new Circle();
        for (Shape shape:shapes) {
            System.out.println(shape);
            System.out.println("Diện tích: "+shape.getArea());
            if (shape instanceof Square){
                ((Square) shape).howtoColor();
            }
        }
    }
}
