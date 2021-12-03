package case_study.Services.customer;

import case_study.Services.FileUtils;
import case_study.models.person.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    static final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\customer.csv";


    {
        customerList = readFile();
    }

    @Override
    public void add() {
        System.out.println("Nhập mã khách");
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
        System.out.println("Nhập loại khách");
        String type = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        customerList.add(new Customer(id, name, birth, gender, cmnd, sdt, email, type, address));
        FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id khách ");
        String id = (sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag = true;
        for (Customer customer : customerList) {
            if (customer.getMa().equals(id) && customer.getHoTen().equals(name)) {
                optionEdit(customer);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Khách không tồn tại");
        }
    }


    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    private void optionEdit(Customer e) {
        int choice = 0;
        while (choice != 10) {
            System.out.println("1.Sửa mã khách");
            System.out.println("2.Sửa tên khách");
            System.out.println("3.Sửa ngày tháng năm sinh");
            System.out.println("4.Sửa giới khách");
            System.out.println("5.Sửa cmnd khách");
            System.out.println("6.Sửa sđt khách");
            System.out.println("7.Sửa email khách");
            System.out.println("8.Sửa loại khách");
            System.out.println("9.Sửa địa chỉ khách hàng");
            System.out.println("10.thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã ");
                    String id = sc.nextLine();
                    e.setMa(id);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 2:
                    System.out.println("Nhập họ tên");
                    String name = sc.nextLine();
                    e.setHoTen(name);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 3:
                    System.out.println("Nhập ngày tháng năm sinh");
                    String birth = sc.nextLine();
                    e.setNgaySinh(birth);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 4:
                    System.out.println("Nhập giới tính");
                    String gender = sc.nextLine();
                    e.setGioiTinh(gender);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 5:
                    System.out.println("Nhập cmnd");
                    String cmnd = sc.nextLine();
                    e.setCmnd(cmnd);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 6:
                    System.out.println("Nhập sđt");
                    String sdt = sc.nextLine();
                    e.setSdt(sdt);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 7:
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    e.setEmail(email);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 8:
                    System.out.println("Nhập loại khách");
                    String type = sc.nextLine();
                    e.setLoaiKhach(type);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
                case 9:
                    System.out.println("Nhập địa chỉ");
                    String address = sc.nextLine();
                    e.setDiaChi(address);
                    FileUtils.writeFile(covertCustomerToString(), PATH_FILE);
                    break;
            }
        }

    }

    private static List<String> covertCustomerToString() {
        List<String> employList = new ArrayList<>();
        for (Customer customer : customerList) {
            employList.add(customer.toString());
        }
        return employList;
    }

    private List<Customer> readFile() {
        List<String> stringList = FileUtils.readFile(PATH_FILE);
        for (String str : stringList) {
            String[] arr = str.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }
    public List<Customer> customers(){
        return customerList;
    }
}
