package case_study.Services.facility;

import case_study.Services.validate.Validate;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    static Map<Facility, Integer> map = new LinkedHashMap<>();
    Facility facility;

    static {
        map.put((new Villa("villa1", "thuê theo ngày", 23, "2.000.000", 4, "3 sao", 6, "2")), 1);
        map.put((new House("house1", "thuê theo tháng", 18, "1.000.000", 3, "2 sao", "1")), 1);
        map.put((new Room("room1", "thuê theo giờ", 8, "750.000", 2, "abc")), 1);
    }

    @Override
    public void add() {
        int choice = 0;
        while (choice != 4) {
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            System.out.println("Chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    input(1);
                    break;
                case 2:
                    input(2);
                    break;
                case 3:
                    input(3);
                    break;
            }
        }
    }


    @Override
    public void display() {
        for (Facility facility : map.keySet()) {
            System.out.println(facility + "," + map.get(facility));
        }
    }

    private void check(Facility e) {
        Integer tempt;
        if (map.containsKey(e)) {
            tempt = map.get(e);
            map.remove(e);
            map.put(e, tempt + 1);
        } else {
            map.put(e, 1);
        }
    }

    private void input(int i) {
        System.out.println("Nhập tên dịch vụ");
        String serviceName = sc.nextLine();
        Validate.validateName(serviceName);
        System.out.println("Nhập kiểu thuê");
        String rentalType = sc.nextLine();
        Validate.validateName(rentalType);
        System.out.println("Nhập diện tích sử dụng");
//        double area = Double.parseDouble(sc.nextLine());
       double area=  Validate.validateArea();
        System.out.println("Nhập chi phí thuê");
        String price = sc.nextLine();
        Validate.validatePositive(price);
        System.out.println("Nhập số người tối đa");
//        int members = Integer.parseInt(sc.nextLine());
       int members= Validate.validateQuantity();
        if (i == 3) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm");
            String freeService = sc.nextLine();
            facility = new Room(serviceName, rentalType, area, price, members, freeService);
            check(facility);
        } else {
            System.out.println("Nhập tiêu chuẩn phòng");
            String standard = sc.nextLine();
            Validate.validateName(standard);
            System.out.println("Nhập số tầng");
            String floor = (sc.nextLine());
            Validate.validatePositive(floor);
            if (i == 1) {
                System.out.println("Diện tích hồ bơi");
              double pool=  Validate.validateArea();
                facility = new Villa(serviceName, rentalType, area, price, members, standard, pool, floor);
                check(facility);
            } else if (i == 2) {
                facility = new House(serviceName, rentalType, area, price, members, standard, floor);
                check(facility);
            }
        }
    }

    public void displayMaintenance() {
        for (Facility facility : map.keySet()) {
            if (map.get(facility) == 5) {
                System.out.println(facility);
            }
        }
    }
}
