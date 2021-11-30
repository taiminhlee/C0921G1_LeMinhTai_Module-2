package case_study.models.facility;

import java.util.Objects;

public abstract class Facility {
    private String tenDichVu, kieuThue, chiPhiThue,maDichVu;
    private double dienTichSuDung;
    private int soNguoiToiDa;

    public Facility() {
    }

    public Facility(String maDichVu,String tenDichVu, String kieuThue, double dienTichSuDung, String chiPhiThue, int soNguoiToiDa) {
        this.tenDichVu = tenDichVu;
        this.maDichVu=maDichVu;
        this.kieuThue = kieuThue;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return   this.tenDichVu + "," + this.kieuThue + "," + this.chiPhiThue + "," + this.maDichVu + "," + this.dienTichSuDung + "," + this.soNguoiToiDa;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return Double.compare(facility.dienTichSuDung, dienTichSuDung) == 0 &&
                Objects.equals(facility.chiPhiThue, chiPhiThue) &&
                soNguoiToiDa == facility.soNguoiToiDa &&
                Objects.equals(tenDichVu, facility.tenDichVu) &&
                Objects.equals(maDichVu, facility.maDichVu) &&
                Objects.equals(kieuThue, facility.kieuThue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
    }
}

