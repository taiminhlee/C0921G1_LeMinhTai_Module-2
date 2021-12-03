package case_study.models.person;

import java.util.Objects;

public class Customer extends Person {
    String loaiKhach,diaChi;

    public Customer() {
    }

    public Customer(String ma, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String loaiKhach, String diaChi) {
        super(ma, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return this.getMa() + "," + this.getHoTen() + "," + this.getNgaySinh() + "," + this.getGioiTinh() + "," + this.getCmnd() + "," + this.getSdt() + "," + this.getEmail() + "," + this.loaiKhach + "," + this.diaChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(this.getMa(), customer.getMa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMa());
    }
}
