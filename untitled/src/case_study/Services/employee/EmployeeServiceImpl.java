package case_study.Services.employee;

import case_study.Services.FileUtils;
import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeServiceList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Employee employee;

    static {
        Employee employee = new Employee("1", "Nguyễn Văn A", "4/7/1999", "nam", "836434273", "294723828", "nguyenvana@gmail.com", "Đại học", "chuyên viên", "20000");
        employeeServiceList.add(employee);
         writeFile(employee);
    }

    @Override
    public void add() {
        System.out.println("Nhập mã nhân viên");
        String id = (sc.nextLine());
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
        String salary = (sc.nextLine());
        employee = new Employee(id, name, birth, gender, cmnd, sdt, email, level, position, salary);
        employeeServiceList.add(employee);
            writeFile(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên");
        String id = (sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag = true;
        for (Employee employee : employeeServiceList) {
            if (employee.getMa() == id && employee.getHoTen().equals(name)) {
                optionEdit(employee);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Nhân viên không tồn tại");
        }
    }


    @Override
    public void display() {
        for (Employee employee : employeeServiceList) {
            System.out.println(employee);
        }
    }

    private void optionEdit(Employee e) {
        int choice = 0;
        while (choice != 11) {
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
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã ");
                    String id = sc.nextLine();
                    e.setMa(id);
                    writeFile(employee);
                    break;
                case 2:
                    System.out.println("Nhập họ tên");
                    String name = sc.nextLine();
                    e.setHoTen(name);
                    writeFile(employee);
                    break;
                case 3:
                    System.out.println("Nhập ngày tháng năm sinh");
                    String birth = sc.nextLine();
                    e.setNgaySinh(birth);
                    writeFile(employee);
                    break;
                case 4:
                    System.out.println("Nhập giới tính");
                    String gender = sc.nextLine();
                    e.setGioiTinh(gender);
                    writeFile(employee);
                    break;
                case 5:
                    System.out.println("Nhập cmnd");
                    String cmnd = sc.nextLine();
                    e.setCmnd(cmnd);
                    writeFile(employee);
                    break;
                case 6:
                    System.out.println("Nhập sđt");
                    String sdt = sc.nextLine();
                    e.setSdt(sdt);
                    writeFile(employee);
                    break;
                case 7:
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    e.setEmail(email);
                    writeFile(employee);
                    break;
                case 8:
                    System.out.println("Nhập trình độ");
                    String level = sc.nextLine();
                    e.setTrinhDo(level);
                    writeFile(employee);
                    break;
                case 9:
                    System.out.println("Nhập vị trí");
                    String position = sc.nextLine();
                    e.setViTri(position);
                    writeFile(employee);
                    break;
                case 10:
                    System.out.println("Nhập lương");
                    String salary = sc.nextLine();
                    e.setLuong(salary);
                    writeFile(employee);
                    break;
            }
        }
    }
    private static void writeFile(Employee e){
//        String line;
//        final String COMMA=",";
        final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\employee.csv";
        List<String> stringList =new ArrayList<>();
        stringList.add(e.toString());
//        for (Employee employee:employeeServiceList) {
//            line=employee.getMa() + COMMA + employee.getHoTen() + COMMA + employee.getNgaySinh() + COMMA +
//                    employee.getGioiTinh() + COMMA + employee.getCmnd() + COMMA + employee.getSdt() + COMMA +
//                    employee.getEmail() + COMMA + employee.getTrinhDo() + COMMA + employee.getViTri() + COMMA +
//                    employee.getLuong();
            FileUtils.writeFile(stringList,PATH_FILE);
        }
    }

