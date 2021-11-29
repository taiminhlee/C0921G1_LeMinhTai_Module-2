package case_study.models.facility;

import case_study.models.facility.Facility;

import java.util.Objects;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String tenDichVu, String kieuThue, double dienTichSuDung, String chiPhiThue, int soNguoiToiDa, String tieuChuanPhong, double dienTichHoBoi, String soTang) {
        super(tenDichVu, kieuThue, dienTichSuDung, chiPhiThue, soNguoiToiDa);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Villa)) return false;
        if (!super.equals(o)) return false;
        Villa villa = (Villa) o;
        return Double.compare(villa.getDienTichSuDung(), getDienTichSuDung()) == 0 &&
                Objects.equals(villa.getChiPhiThue(), getChiPhiThue()) &&
                getSoNguoiToiDa() == villa.getSoNguoiToiDa() &&
                Objects.equals(getTenDichVu(), villa.getTenDichVu()) &&
                Objects.equals(getKieuThue(), villa.getKieuThue()) &&
                Double.compare(villa.dienTichHoBoi, dienTichHoBoi) == 0 &&
                soTang.equals(villa.soTang) &&
                Objects.equals(tieuChuanPhong, villa.tieuChuanPhong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tieuChuanPhong, dienTichHoBoi, soTang);
    }
}
