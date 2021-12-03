package case_study.Services.booking;

import case_study.Services.FileUtils;
import case_study.Services.Service;
import case_study.Services.customer.CustomerServiceImpl;
import case_study.Services.facility.FacilityServiceImpl;
import case_study.Services.Validate;
import case_study.models.Booking;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner sc = new Scanner(System.in);
    static Set<Booking> bookings = new TreeSet<>(new BookingComparator());
    static final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\booking.csv";

    {
        bookings = readFile();
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
        for (Booking booking:bookings) {
            while (booking.getMaBooking().equals(idBooking)){
                System.out.println("Mã booking đã trùng");
                idBooking=sc.nextLine();
            }
        }
        System.out.println("Nhập ngày bắt đầu");
        String start = sc.nextLine();
        Validate.validateDate(start);
        System.out.println("Nhập ngày kết thúc");
        String end = sc.nextLine();
        Validate.validateDate(end);
        System.out.println("Nhập mã khách hàng");
        String idCustomer = sc.nextLine();
        System.out.println("Nhập mã dịch vụ");
        String idService = sc.nextLine();
        System.out.println("Nhập loại dịch vụ");
        String typeService = sc.nextLine();
        bookings.add(new Booking(idBooking, start, end, idCustomer, idService, typeService));
        FileUtils.writeFile(covertBookingToString(), PATH_FILE);
    }

    @Override
    public void display() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public  List<String> covertBookingToString() {
        List<String> stringList = new ArrayList<>();
        for (Booking booking:bookings) {
            stringList.add(booking.toString());
        }
        return stringList;
    }


    public Set<Booking> readFile() {
        List<String> stringList = FileUtils.readFile(PATH_FILE);
        for (String str : stringList) {
            String[] arr = str.split(",");
            bookings.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
        return bookings;
    }
    public Set<Booking> getBookingMonth(){
        Calendar calendar=Calendar.getInstance();
        String month =Integer.toString(calendar.get(Calendar.MONTH)+1);
        String year =Integer.toString(calendar.get(Calendar.YEAR));
        Set<Booking> bookingMonth=new TreeSet<>(new BookingComparator());
        for (Booking e: bookings) {
            String[] arrStart = e.getNgayBatDau().split("/");
            String[] arrEnd = e.getNgayKetThuc().split("/");
            if (arrStart[1].equals(month) && arrStart[2].equals(year) || arrEnd[1].equals(month)&&arrEnd[2].equals(year)){
                bookingMonth.add(e);
            }
        }
        return bookingMonth;
    }
}
