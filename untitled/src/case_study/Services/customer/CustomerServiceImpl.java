package case_study.Services.customer;

import case_study.Services.customer.CustomerService;
import case_study.models.person.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static List<Customer> customerList = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    Customer customer;

    static {
        customerList.add(new Customer(28, "Lê Thị Hoa", "6/7/1998", "nữ", "946483475935", "098483642", "HoaThii@gmail.com", "Platinium", "12A"));
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
        System.out.println("Nhập loại khách");
        String type = sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        customer = new Customer(id, name, birth, gender, cmnd, sdt, email, type, address);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id nhân viên");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên cần sửa");
        String name = sc.nextLine();
        boolean flag = true;
        for (Customer customer : customerList) {
            if (customer.getMa() == id && customer.getHoTen().equals(name)) {
                optionEdit(customer);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Nhân viên không tồn tại");
        }
    }

    @Override
    public void remove() {
        System.out.println("Nhập mã nhân viên cần xóa");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên cần xóa");
        String name=sc.nextLine();
        customerList.removeIf(customer -> customer.getMa() == id && customer.getHoTen().equals(name));
    }

    @Override
    public void display() {
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
    }

    private void optionEdit(Customer e) {
        int choice = 0;
        while (choice != 10) {
            System.out.println("1.Sửa mã khách");
            System.out.println("2.Sửa tên khách");
            System.out.println("3.Sửa ngày tháng năm khách");
            System.out.println("4.Sửa giới khách");
            System.out.println("5.Sửa cmnd khách");
            System.out.println("6.Sửa sđt khách");
            System.out.println("7.Sửa email khách");
            System.out.println("8.Sửa loại khách");
            System.out.println("9.Sửa địa chỉ nhân viên");
            System.out.println("10.thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập mã ");
                    int id = sc.nextInt();
                    e.setMa(id);
                    break;
                case 2:
                    System.out.println("Nhập họ tên");
                    String name = sc.nextLine();
                    e.setHoTen(name);
                    break;
                case 3:
                    System.out.println("Nhập ngày tháng năm sinh");
                    String birth = sc.nextLine();
                    e.setNgaySinh(birth);
                    break;
                case 4:
                    System.out.println("Nhập giới tính");
                    String gender = sc.nextLine();
                    e.setGioiTinh(gender);
                    break;
                case 5:
                    System.out.println("Nhập cmnd");
                    String cmnd = sc.nextLine();
                    e.setCmnd(cmnd);
                    break;
                case 6:
                    System.out.println("Nhập sđt");
                    String sdt = sc.nextLine();
                    e.setSdt(sdt);
                    break;
                case 7:
                    System.out.println("Nhập email");
                    String email = sc.nextLine();
                    e.setEmail(email);
                    break;
                case 8:
                    System.out.println("Nhập trình độ");
                    String type = sc.nextLine();
                    e.setLoaiKhach(type);
                    break;
                case 9:
                    System.out.println("Nhập vị trí");
                    String address = sc.nextLine();
                    e.setDiaChi(address);
                    break;
            }
        }
    }
}
