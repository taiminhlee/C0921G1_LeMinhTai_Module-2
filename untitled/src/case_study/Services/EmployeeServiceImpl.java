package case_study.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{
   private int maNhanVien;
   private String hoTen,ngaySinh,gioiTinh;
   private int cmnd,sdt;
  private String email,trinhDo,viTri;
   private int luong;

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(int maNhanVien, String hoTen, String ngaySinh, String gioiTinh, int cmnd, int sdt, String email, String trinhDo, String viTri, int luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public long getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public float getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "EmployeeServiceImpl{" +
                "maNhanVien=" + maNhanVien +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd=" + cmnd +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }
   static  List<EmployeeServiceImpl> employeeServiceList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    EmployeeServiceImpl employeeService;
    static {
        employeeServiceList.add(new EmployeeServiceImpl(1,"Nguyễn Văn A","4/7/1999","nam",836434273,294723828,"nguyenvana@gmail.com","Đại học","chuyên viên",20000));
    }

    @Override
    public void add() {
        System.out.println("Nhập mã nhân viên");
        int id=sc.nextInt();
        System.out.println("Nhập hộ và tên");
        String name=sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String birth=sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender=sc.nextLine();
        System.out.println("Nhập cmnd");
        int cmnd=sc.nextInt();
        System.out.println("Nhập số điện thoại");
        int sdt=sc.nextInt();
        System.out.println("Nhập email");
        String email=sc.nextLine();
        System.out.println("Nhập trình độ");
        String level=sc.nextLine();
        System.out.println("Nhập vị trí");
        String position=sc.nextLine();
        System.out.println("Nhập lương");
        int salary=sc.nextInt();
        employeeService=new EmployeeServiceImpl(id,name,birth,gender,cmnd,sdt,email,level,position,salary);
        employeeServiceList.add(employeeService);
    }

    @Override
    public void edit() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }
}
