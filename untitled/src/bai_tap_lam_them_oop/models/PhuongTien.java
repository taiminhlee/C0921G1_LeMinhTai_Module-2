package bai_tap_lam_them_oop.models;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private Object data;
    private String chuSoHuu;
    int namSanXuat;

    public PhuongTien() {
    }

    public PhuongTien(String bienKiemSoat, Object data, String chuSoHuu,int namSanXuat) {
        this.bienKiemSoat = bienKiemSoat;
        this.data = data;
        this.chuSoHuu = chuSoHuu;
        this.namSanXuat=namSanXuat;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", data=" + data +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                ", namSanXuat=" + namSanXuat +
                '}';
    }
}
