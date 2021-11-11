package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Square extends ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Square implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void resize(double percent) {
      this.setSide(this.getSide()+this.getSide()*percent/100);
    }
}
