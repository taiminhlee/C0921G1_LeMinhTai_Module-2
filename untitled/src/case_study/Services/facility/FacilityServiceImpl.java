package case_study.Services.facility;

import case_study.Services.FileUtils;
import case_study.Services.booking.BookingServiceImpl;
import case_study.Services.Validate;
import case_study.models.Booking;
import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner sc = new Scanner(System.in);
    static Map<Facility, Integer> fa = new LinkedHashMap<>();
    static Facility facility;
    static final String PATH_FILE_HO = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\house.csv";
    static final String PATH_FILE_RO = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\room.csv";
    static final String PATH_FILE_VL = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\villa.csv";

    {
        fa = readFile();
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
        for (Facility facility : fa.keySet()) {
            System.out.println(facility);
        }

    }


    private void input(int i) {
        System.out.println("Nhập mã dịch vụ");
        String idService = sc.nextLine();
        Validate.validateIdService(idService);
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
            FileUtils.writeFile(covertFacilityToString((facility)), PATH_FILE_RO);
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
                FileUtils.writeFile(covertFacilityToString((facility)), PATH_FILE_VL);
            } else if (i == 2) {
                facility = new House(idService, serviceName, rentalType, area, price, members, standard, floor);
                FileUtils.writeFile(covertFacilityToString((facility)), PATH_FILE_HO);
            }
        }
    }

    public void displayMaintenance() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        Set<Booking> bookings = bookingService.getBookingMonth();
        Map<Facility, Integer> facility = new HashMap<>();
        Integer tempt;
        for (Booking booking : bookings) {
            for (Facility e : fa.keySet()) {
                if (booking.getMaDichVu().equals(e.getMaDichVu())) {
                    if (fa.containsKey(e)) {
                        tempt=fa.get(e);
                        facility.put(e, tempt + 1);
                    } else {
                        facility.put(e, 1);
                    }
                }
            }
        }
        for (Facility e : facility.keySet()) {
            System.out.println(e + ",số lần sử dụng: " + facility.get(e));
        }
    }

    private static List<String> covertFacilityToString(Facility e) {
        List<String> villaList = new ArrayList<>();
        List<String> houseList = new ArrayList<>();
        List<String> roomList = new ArrayList<>();
        for (Facility key : fa.keySet()) {
            if (key instanceof Villa) {
                villaList.add(key.toString() + "," + fa.get(key));
            } else if (key instanceof House) {
                houseList.add(key.toString() + "," + fa.get(key));
            } else {
                roomList.add(key.toString() + "," + fa.get(key));
            }
        }
        if (e instanceof Villa) {
            return villaList;
        } else if (e instanceof House) {
            return houseList;
        } else return roomList;
    }

    private Map<Facility, Integer> readFile() {
        List<String> villaList = FileUtils.readFile(PATH_FILE_VL);
        List<String> houseList = FileUtils.readFile(PATH_FILE_HO);
        List<String> roomList = FileUtils.readFile(PATH_FILE_RO);
        for (String str : villaList) {
            String[] arr = str.split(",");
            fa.put(new Villa(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), arr[4], Integer.parseInt(arr[5]), arr[6], Double.parseDouble(arr[7]), arr[8]), Integer.parseInt(arr[9]));
        }
        for (String str : houseList) {
            String[] arr = str.split(",");
            fa.put(new House(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), arr[4], Integer.parseInt(arr[5]), arr[6], arr[7]), Integer.parseInt(arr[8]));
        }
        for (String str : roomList) {
            String[] arr = str.split(",");
            fa.put(new Room(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), arr[4], Integer.parseInt(arr[5]), arr[6]), Integer.parseInt(arr[7]));
        }
        return fa;
    }
}

