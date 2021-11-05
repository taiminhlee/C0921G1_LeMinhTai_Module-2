package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;


import ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        shapes[2]=new Square();
        for (Shape shape:shapes) {
            if (shape instanceof Circle) {
                Circle sh = (Circle) shape;
                System.out.println("Before resize: "+sh);
                sh.resize(Math.random()*99+1);
                System.out.println("After resize: "+sh);
            }else if(shape instanceof Rectangle){
                Rectangle sh =(Rectangle) shape;
                System.out.println("Before resize: "+sh);
                sh.resize(Math.random()*99+1);
                System.out.println("After resize: "+sh);
            }else if (shape instanceof Square){
                Square sh=(Square)shape;
                System.out.println("Before resize: "+sh);
                sh.resize(Math.random()*99+1);
                System.out.println("After resize: "+sh);
            }
        }
    }
}
