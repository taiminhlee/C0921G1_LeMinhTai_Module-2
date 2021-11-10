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
            if (shape instanceof Square){
                Square sh =(Square) shape;
                sh.howtoColor();
            }else if (shape instanceof ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Rectangle) {
                Rectangle sh = (ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Rectangle) shape;

                System.out.println("area retangle: " +sh.getArea());
            }
            else if (shape instanceof ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Circle){
                ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Circle sh=(ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.Circle) shape;
                System.out.println("area circle: "+sh.getArea());
            }
        }
    }
}
