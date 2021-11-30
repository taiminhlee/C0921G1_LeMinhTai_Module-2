package case_study.Services.facility;

import case_study.Services.FileUtils;
import case_study.Services.validate.Validate;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    static Map<Facility, Integer> map = new LinkedHashMap<>();
    Facility facility;

    static {
        Facility facility1 = new Villa("SVVL-0383", "villa1", "thuê theo ngày", 23, "2.000.000", 4, "3 sao", 6, "2");
        map.put(facility1, 1);
        Facility facility2 = new House("SVHO-3538", "house1", "thuê theo tháng", 18, "1.000.000", 3, "2 sao", "1");
        map.put(facility2, 1);
        Facility facility3 = new Room("SVRO-5836", "room1", "thuê theo giờ", 8, "750.000", 2, "abc");
        map.put(facility3, 1);
        writeFile();
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
            System.out.println(facility + ", đã sử dụng " + map.get(facility));
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
        System.out.println("Nhập mã dịch vụ");
        String idService = sc.nextLine();
        Validate.validaIdService(idService);
        System.out.println("Nhập tên dịch vụ");
        String serviceName = sc.nextLine();
        Validate.validateName(serviceName);
        System.out.println("Nhập kiểu thuê");
        String rentalType = sc.nextLine();
        Validate.validateName(rentalType);
        System.out.println("Nhập diện tích sử dụng");
        double area = Validate.validateArea();
        System.out.println("Nhập chi phí thuê");
        String price = sc.nextLine();
        Validate.validatePositive(price);
        System.out.println("Nhập số người tối đa");
        int members = Validate.validateQuantity();
        if (i == 3) {
            System.out.println("Nhập dịch vụ miễn phí đi kèm");
            String freeService = sc.nextLine();
            facility = new Room(idService, serviceName, rentalType, area, price, members, freeService);
            check(facility);
            writeFile();
        } else {
            System.out.println("Nhập tiêu chuẩn phòng");
            String standard = sc.nextLine();
            Validate.validateName(standard);
            System.out.println("Nhập số tầng");
            String floor = (sc.nextLine());
            Validate.validatePositive(floor);
            if (i == 1) {
                System.out.println("Diện tích hồ bơi");
                double pool = Validate.validateArea();
                facility = new Villa(idService, serviceName, rentalType, area, price, members, standard, pool, floor);
                check(facility);
                writeFile();
            } else if (i == 2) {
                facility = new House(idService, serviceName, rentalType, area, price, members, standard, floor);
                check(facility);
                writeFile();
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

    private static void writeFile() {
        final String PATH_FILE_HO = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\house.csv";
        final String PATH_FILE_RO = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\room.csv";
        final String PATH_FILE_VL = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\villa.csv";
        List<String> stringList = new ArrayList<>();
        for (Facility facility:map.keySet()) {
            if (facility instanceof Villa){
                stringList.add(facility.toString());
                FileUtils.writeFile(stringList, PATH_FILE_VL);
                break;
            }else if (facility instanceof House){
                stringList.add(facility.toString());
                FileUtils.writeFile(stringList, PATH_FILE_HO);
                break;
            }else if (facility instanceof Room){
                stringList.add(facility.toString());
                FileUtils.writeFile(stringList, PATH_FILE_RO);
                break;
            }
        }

    }
}

