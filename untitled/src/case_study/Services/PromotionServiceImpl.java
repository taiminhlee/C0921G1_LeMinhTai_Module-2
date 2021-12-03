package case_study.Services;

import case_study.Services.booking.BookingComparator;
import case_study.Services.booking.BookingServiceImpl;
import case_study.Services.customer.CustomerService;
import case_study.Services.customer.CustomerServiceImpl;
import case_study.models.Booking;
import case_study.models.person.Customer;

import java.util.*;

public class PromotionServiceImpl {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    Scanner sc = new Scanner(System.in);

    public void displayUseService() {
        Set<Booking> bookings = new TreeSet<>(new BookingComparator());
        bookings.addAll(bookingService.readFile());
        System.out.println("Nhập năm hiển thị sử dụng dịch vụ");
        String year = sc.nextLine();
        for (Booking booking : bookings) {
            String[] yearStart = booking.getNgayBatDau().split("/");
            String[] yearEnd = booking.getNgayKetThuc().split("/");
            if (yearStart[2].equals(year) || yearEnd[2].equals(year)) {
                System.out.println(booking);
            }
        }
    }

    public void displayCustomerGetVoucher() {
        Stack<Booking> bookings = new Stack<>();
        bookings.addAll(bookingService.getBookingMonth());
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        List<Customer> list = customerService.customers();
        for (Booking booking:bookings) {
            System.out.println(booking);
        }
        System.out.println("Nhập số lượng voucher 10%");
        int voucher10 = sc.nextInt();
        System.out.println("Nhập số lượng voucher 20%");
        int voucher20 = sc.nextInt();
        System.out.println("Nhập số lượng voucher 50%");
        int voucher50 = sc.nextInt();
        for (int i = 0; i < voucher10; i++) {
            for (Customer customer : list) {
                for (int j = 0; j < bookings.size(); j++) {
                    if (!bookings.isEmpty() && customer.getMa().equals(bookings.pop().getMaKhachHang())) {
                        System.out.println(customer + "được voucher 10%");
                        break;
                    }
                }break;
            }
        }
        for (int i = 0; i < voucher20; i++) {
            for (Customer customer : list) {
                for (int j = 0; j < bookings.size(); j++) {
                    if (!bookings.isEmpty() && customer.getMa().equals(bookings.pop().getMaKhachHang())) {
                        System.out.println(customer + "được voucher 20%");
                        break;
                    }
                }break;
            }
        }
        for (int i = 0; i < voucher50; i++) {
            for (Customer customer : list) {
                for (int j = 0; j < bookings.size(); j++) {
                    if (!bookings.isEmpty() && customer.getMa().equals(bookings.pop().getMaKhachHang())) {
                        System.out.println(customer + "được voucher 50%");
                        break;
                    }
                }break;
            }
        }
    }
}
