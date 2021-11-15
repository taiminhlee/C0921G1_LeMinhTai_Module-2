package bai_tap_lam_them_oop.models;

public class XeMay extends PhuongTien{
    int congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, Object data, String chuSoHuu,int namSanXuat, int congSuat) {
        super(bienKiemSoat, data, chuSoHuu,namSanXuat);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                super.toString()+
                "congSuat=" + congSuat +
                '}';
    }
}
