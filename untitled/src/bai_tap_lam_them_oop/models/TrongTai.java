package bai_tap_lam_them_oop.models;

public class TrongTai extends PhuongTien{
    int trongTai;

    public TrongTai() {
    }

    public TrongTai(String bienKiemSoat, Object data, String chuSoHuu,int namSanXuat, int trongTai) {
        super(bienKiemSoat, data, chuSoHuu,namSanXuat);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "TrongTai{" +
                super.toString()+
                "trongTai=" + trongTai +
                '}';
    }
}
