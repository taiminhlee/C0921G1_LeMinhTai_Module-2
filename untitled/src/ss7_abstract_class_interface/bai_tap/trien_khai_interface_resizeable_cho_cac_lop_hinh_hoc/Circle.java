package ss7_abstract_class_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

public class Circle extends ss6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle implements Resizeable{

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius() + (this.getRadius() + percent / 100));
    }
}
