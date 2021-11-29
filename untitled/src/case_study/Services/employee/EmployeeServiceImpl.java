package case_study.Services.employee;

import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeServiceList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Employee employee;

    static {
        employeeServiceList.add(new Employee(1, "Nguyễn Văn A", "4/7/1999", "nam", "836434273", "294723828", "nguyenvana@gmail.com", "Đại học", "chuyên viên", 20000));
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
        employee = new Employee(id, name, birth, gender, cmnd, sdt, email, level, position, salary);
        employeeServiceList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag=true;
        for (Employee employee : employeeServiceList) {
            if (employee.getMa() == id && employee.getHoTen().equals(name)) {
               optionEdit(employee);
               flag=false;
            }
        }if (flag){
            System.out.println("Nhân viên không tồn tại");
        }
    }

    @Override
    public void remove() {
        System.out.println("Nhập mã nhân viên cần xóa");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên cần xóa");
        String name=sc.nextLine();
        employeeServiceList.removeIf(employee -> employee.getMa() == id && employee.getHoTen().equals(name));
    }

    @Override
    public void display() {
        for (Employee employee:employeeServiceList) {
            System.out.println(employee);
        }
    }
    private void optionEdit(Employee e){
        int choice=0;
        while (choice !=11){
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
                    e.setMa(id);
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
            }
        }
    }
}
