package case_study.models.person;

public class Employee extends Person {
    private String trinhDo, viTri;
    private int luong;

    public Employee() {
    }

    public Employee(int maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String trinhDo, String viTri, int luong) {
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

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
}
