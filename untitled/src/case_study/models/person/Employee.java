package case_study.models.person;

public class Employee extends Person {
    private String trinhDo, viTri;
    private String luong;

    public Employee() {
    }

    public Employee(String maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String trinhDo, String viTri, String luong) {
        super(maNhanVien, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email);
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.trinhDo + "," + this.viTri + "," + this.luong;
    }
}
