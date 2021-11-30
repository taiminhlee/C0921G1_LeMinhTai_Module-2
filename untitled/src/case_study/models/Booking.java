package case_study.models;

import java.util.Objects;

public class Booking {
    String maBooking,ngayBatDau,ngayKetThuc,maKhachHang,tenDichVu,loaiDichVu;

    public Booking() {
    }

    public Booking(String maBooking, String ngayBatDau, String ngayKetThuc, String maKhachHang, String tenDichVu, String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.maKhachHang = maKhachHang;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return this.maBooking + "," + this.ngayBatDau + "," + this.ngayKetThuc + "," + this.maKhachHang + "," + this.tenDichVu + "," + this.loaiDichVu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking)) return false;
        Booking booking = (Booking) o;
        return Objects.equals(maBooking, booking.maBooking) &&
                Objects.equals(ngayBatDau, booking.ngayBatDau) &&
                Objects.equals(ngayKetThuc, booking.ngayKetThuc) &&
                Objects.equals(maKhachHang, booking.maKhachHang) &&
                Objects.equals(tenDichVu, booking.tenDichVu) &&
                Objects.equals(loaiDichVu, booking.loaiDichVu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, tenDichVu, loaiDichVu);
    }
}
