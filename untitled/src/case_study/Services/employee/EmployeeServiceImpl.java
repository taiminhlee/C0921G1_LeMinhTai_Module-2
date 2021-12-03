package case_study.Services.employee;

import case_study.Services.FileUtils;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Villa;
import case_study.models.person.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static List<Employee> employeeServiceList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Employee employee;
    final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\employee.csv";

    {
        employeeServiceList = readFile();
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
        FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên");
        String id = (sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag = true;
        for (Employee employee : employeeServiceList) {
            if (employee.getMa().equals(id) && employee.getHoTen().equals(name)) {
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
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 2:
                    System.out.println("Nhập họ tên");
                    String name = sc.nextLine();
                    e.setHoTen(name);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 3:
                    System.out.println("Nhập ngày tháng năm sinh");
                    String birth = sc.nextLine();
                    e.setNgaySinh(birth);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 4:
                    System.out.println("Nhập giới tính");
                    String gender = sc.nextLine();
                    e.setGioiTinh(gender);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 5:
                    System.out.println("Nhập cmnd");
                    String cmnd = sc.nextLine();
                    e.setCmnd(cmnd);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 6:
                    System.out.println("Nhập sđt");
                    String sdt = sc.nextLine();
                    e.setSdt(sdt);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 7:
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    e.setEmail(email);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 8:
                    System.out.println("Nhập trình độ");
                    String level = sc.nextLine();
                    e.setTrinhDo(level);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 9:
                    System.out.println("Nhập vị trí");
                    String position = sc.nextLine();
                    e.setViTri(position);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
                case 10:
                    System.out.println("Nhập lương");
                    String salary = sc.nextLine();
                    e.setLuong(salary);
                    FileUtils.writeFile(covertEmployeeToString(), PATH_FILE);
                    break;
            }
        }
    }

    private static List<String> covertEmployeeToString() {
        List<String> employList = new ArrayList<>();
        for (Employee employee : employeeServiceList) {
            employList.add(employee.toString());
        }
        return employList;
    }

    private List<Employee> readFile() {
        List<String> stringList = FileUtils.readFile(PATH_FILE);
        for (String str : stringList) {
            String[] arr = str.split(",");
            employeeServiceList.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]));
        }
        return employeeServiceList;
    }
}

