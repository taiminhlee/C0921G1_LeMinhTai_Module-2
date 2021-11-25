package case_study.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private int maNhanVien;
    private String hoTen, ngaySinh, gioiTinh;
    private String cmnd, sdt;
    private String email, trinhDo, viTri;
    private int luong;

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(int maNhanVien, String hoTen, String ngaySinh, String gioiTinh, String cmnd, String sdt, String email, String trinhDo, String viTri, int luong) {
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

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
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

    static List<EmployeeServiceImpl> employeeServiceList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    EmployeeServiceImpl employeeService;

    static {
        employeeServiceList.add(new EmployeeServiceImpl(1, "Nguyễn Văn A", "4/7/1999", "nam", "836434273", "294723828", "nguyenvana@gmail.com", "Đại học", "chuyên viên", 20000));
    }

    @Override
    public void add() {
        System.out.println("Nhập mã nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập hộ và tên");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh");
        String birth = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập cmnd");
        String cmnd = (sc.nextLine());
        System.out.println("Nhập số điện thoại");
        String sdt = (sc.nextLine());
        System.out.println("Nhập email");
        String email = sc.nextLine();
        System.out.println("Nhập trình độ");
        String level = sc.nextLine();
        System.out.println("Nhập vị trí");
        String position = sc.nextLine();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(sc.nextLine());
        employeeService = new EmployeeServiceImpl(id, name, birth, gender, cmnd, sdt, email, level, position, salary);
        employeeServiceList.add(employeeService);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag=true;
        for (EmployeeServiceImpl employeeService : employeeServiceList) {
            if (employeeService.getMaNhanVien() == id && employeeService.getHoTen().equals(name)) {
               optionEdit(employeeService);
               flag=false;
            }
        }if (flag){
            System.out.println("Nhân viên không tồn tại");
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }
    private void optionEdit(EmployeeServiceImpl e){
        int choice;
        while (true){
            System.out.println("1.Sửa mã nhân viên");
            System.out.println("2.Sửa tên nhân viên");
            System.out.println("3.Sửa ngày tháng năm nhân viên");
            System.out.println("4.Sửa giới nhân viên");
            System.out.println("5.Sửa cmnd nhân viên");
            System.out.println("6.Sửa sđt nhân viên");
            System.out.println("7.Sửa email nhân viên");
            System.out.println("8.Sửa trình độ nhân viên");
            System.out.println("9.Sửa vị trí nhân viên");
            System.out.println("10.Sửa lương nhân viên");
            System.out.println("11.thoát");
            choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã ");
                    int id=sc.nextInt();
                    e.setMaNhanVien(id);
                    break;
                case 2:
                    System.out.println("Nhập họ tên");
                    String name=sc.nextLine();
                    e.setHoTen(name);
                    break;
                case 3:
                    System.out.println("Nhập ngày tháng năm sinh");
                    String birth=sc.nextLine();
                    e.setNgaySinh(birth);
                    break;
                case 4:
                    System.out.println("Nhập giới tính");
                    String gender=sc.nextLine();
                    e.setGioiTinh(gender);
                    break;
                case 5:
                    System.out.println("Nhập cmnd");
                    String cmnd=sc.nextLine();
                    e.setCmnd(cmnd);
                    break;
                case 6:
                    System.out.println("Nhập sđt");
                    String sdt=sc.nextLine();
                    e.setSdt(sdt);
                    break;
                case 7:
                    System.out.println("Nhập email");
                    String email=sc.nextLine();
                    e.setEmail(email);
                    break;
                case 8:
                    System.out.println("Nhập trình độ");
                    String level=sc.nextLine();
                    e.setTrinhDo(level);
                    break;
                case 9:
                    System.out.println("Nhập vị trí");
                    String position=sc.nextLine();
                    e.setViTri(position);
                    break;
                case 10:
                    System.out.println("Nhập lương");
                    int salary=sc.nextInt();
                    e.setLuong(salary);
                    break;
                case 11:
                    System.exit(0);
            }
        }
    }
}
