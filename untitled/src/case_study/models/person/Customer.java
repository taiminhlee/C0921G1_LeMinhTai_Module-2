package case_study.models.person;

public class Customer extends Person {
    String loaiKhach,diaChi;

    public Customer() {
    }

    public Customer(int ma, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String loaiKhach, String diaChi) {
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
        return "Customer{" +
                super.toString() +
                "loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
