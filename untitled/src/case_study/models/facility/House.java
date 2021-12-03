package case_study.models.facility;

import case_study.models.facility.Facility;

import java.util.Objects;

public class House extends Facility {
    private String soTang;
    private String tieuChuanPhong;

    public House() {
    }

    public House(String maDichVu, String tenDichVu, String kieuThue, double dienTichSuDung, String chiPhiThue, int soNguoiToiDa, String soTang, String tieuChuanPhong) {
        super(maDichVu, tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.soTang = soTang;
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    @Override
    public String toString() {
        return this.getMaDichVu() +  "," + this.getTenDichVu() + "," + this.getKieuThue() + "," + this.getDienTichSuDung() + "," + this.getChiPhiThue() + "," + this.getSoNguoiToiDa() + "," + this.soTang + "," + this.tieuChuanPhong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        if (!super.equals(o)) return false;
        House house =(House) o;
        return super.equals(o) &&
                soTang.equals(house.soTang) &&
                tieuChuanPhong.equals(house.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, soTang);
    }
}
