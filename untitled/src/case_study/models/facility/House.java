package case_study.models.facility;

import case_study.models.facility.Facility;

import java.util.Objects;

public class House extends Facility {
   private String soTang;
   private String tieuChuanPhong;
    public House() {
    }

    public House(String tenDichVu, String kieuThue, double dienTichSuDung, String chiPhiThue, int soNguoiToiDa, String tieuChuanPhong, String soTang) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }


    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                ", tieuChuanPhong=" + tieuChuanPhong +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        if (!super.equals(o)) return false;
        House house = (House) o;
        return Double.compare(house.getDienTichSuDung(), getDienTichSuDung()) == 0 &&
                Objects.equals(house.getChiPhiThue(), getChiPhiThue()) &&
                getSoNguoiToiDa() == house.getSoNguoiToiDa() &&
                Objects.equals(getTenDichVu(), house.getTenDichVu()) &&
                Objects.equals(getKieuThue(), house.getKieuThue()) &&
                Objects.equals(tieuChuanPhong,house.tieuChuanPhong) &&
                soTang.equals(house.soTang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, soTang);
    }
}
