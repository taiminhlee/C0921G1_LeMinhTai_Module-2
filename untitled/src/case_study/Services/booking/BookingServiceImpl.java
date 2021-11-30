package case_study.Services.booking;

import case_study.Services.FileUtils;
import case_study.Services.Service;
import case_study.Services.customer.CustomerServiceImpl;
import case_study.Services.facility.FacilityServiceImpl;
import case_study.models.Booking;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookingServiceImpl implements BookingService {
    Scanner sc = new Scanner(System.in);
    static Set<Booking> bookings = new HashSet<>();
    static Booking booking;


    static {
        booking = new Booking("B42", "6/9", "12/9", "28", "vila1", "Loại A");
        bookings.add(booking);
//        writeFile();
    }

    @Override
    public void add() {
        System.out.println("Danh Sách khách hàng: ");
        Service customer = new CustomerServiceImpl();
        customer.display();
        System.out.println("Danh sách dịch vụ");
        Service facility = new FacilityServiceImpl();
        facility.display();
        System.out.println("Nhập mã booking");
        String idBooking = sc.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String start = sc.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String end = sc.nextLine();
        System.out.println("Nhập mã khách hàng");
        String idCustomer = sc.nextLine();
        System.out.println("Nhập tên dịch vụ");
        String nameService = sc.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String typeService = sc.nextLine();
        booking = new Booking(idBooking, start, end, idCustomer, nameService, typeService);
        check(booking);
//        writeFile();
    }

    @Override
    public void display() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

//    private static void writeFile() {
//        String line;
//        final String COMMA = ",";
//        final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\booking.csv";
//        for (Booking booking : bookings) {
//            line = booking.getMaBooking() + COMMA + booking.getNgayBatDau() + COMMA + booking.getNgayKetThuc() + COMMA +
//                    booking.getMaKhachHang() + COMMA + booking.getTenDichVu() + COMMA + booking.getLoaiDichVu();
//            FileUtils.writeFile(line, PATH_FILE);
//        }
//    }

    private void check(Booking o) {
        boolean flag = true;
        for (Booking booking : bookings) {
            if (booking.equals(o)) {
                System.out.println("Booking đã tồn tại");
                flag = false;
                break;
            }
        }
        if (flag) bookings.add(o);
    }
}
