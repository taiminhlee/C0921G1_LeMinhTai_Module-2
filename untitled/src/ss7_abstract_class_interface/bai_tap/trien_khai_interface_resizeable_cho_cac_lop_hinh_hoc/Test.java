package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(3);
        shapes[1]=new Rectangle(2,5);
        shapes[2]=new Square(5);
        for (Shape shape:shapes) {
            if (shape instanceof Circle) {
                System.out.println("Before resize Circle: "+shape.getArea());
                ((Circle)shape).resize(Math.random()*99+1);
                System.out.println("After resize Circle: "+shape.getArea());
                System.out.println("------------------------");
            }else if(shape instanceof Rectangle){

                System.out.println("Before resize Rectangle: "+shape.getArea());
                ((Rectangle)shape).resize(Math.random()*99+1);
                System.out.println("After resize Rectangle: "+shape.getArea());
                System.out.println("------------------------");
            }else if (shape instanceof Square){
                System.out.println("Before resize Square: "+shape.getArea());
                ((Square)shape).resize(Math.random()*99+1);
                System.out.println("After resize Square: "+shape.getArea());
                System.out.println("---------------------------------");
            }
        }
    }
}
