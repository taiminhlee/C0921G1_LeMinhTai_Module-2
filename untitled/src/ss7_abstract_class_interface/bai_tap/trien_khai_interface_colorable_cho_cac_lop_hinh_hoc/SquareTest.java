package ss7_abstract_class_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Square(3);
        shapes[1]=new Rectangle(2,3);
        shapes[2]=new Circle(4);
        for (Shape shape:shapes) {
            System.out.println(shape);
           if (shape instanceof Rectangle){
               System.out.println("Diện tích: "+((Rectangle)shape).getArea());
           }
            if (shape instanceof Circle){
                System.out.println("Diện tích: "+((Circle)shape).getArea());
            }
            if (shape instanceof Square){
                ((Square) shape).howtoColor();
            }
        }
    }
}
