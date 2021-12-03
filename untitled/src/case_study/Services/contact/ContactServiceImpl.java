package case_study.Services.contact;

import case_study.Services.FileUtils;
import case_study.Services.booking.BookingServiceImpl;
import case_study.models.Booking;
import case_study.models.Contracts;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    static Set<Contracts> contractSet = new HashSet<>();
    Queue<Booking> bookings = new LinkedList<>();
    BookingServiceImpl bookingService = new BookingServiceImpl();
    Scanner sc = new Scanner(System.in);
    final String PATH_FILE = "G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\case_study\\data\\contract.csv";

    {
        contractSet = readFile();
    }

    @Override
    public void add() {
        bookings.addAll(bookingService.readFile());
        Booking booking = bookings.poll();
        System.out.println("Đang tạo hợp đồng có mã booking:" + booking.getMaBooking());
        System.out.println("Đang tạo hợp đồng có mã khách hàng:" + booking.getMaKhachHang());
        String idBooking = booking.getMaBooking();
        String idCustomer = booking.getMaKhachHang();
        System.out.println("Nhập số hợp đồng");
        int numContact = Integer.parseInt(sc.nextLine());
        for (Contracts contracts : contractSet) {
            if (contracts.getSoHopDong() == numContact) {
                System.out.println("Trùng số hợp đồng yêu cầu nhập lại");
                numContact= Integer.parseInt(sc.nextLine());
                booking = bookings.poll();
                idBooking = booking.getMaBooking();
                idCustomer = booking.getMaKhachHang();
            }
        }
        System.out.println("Số tiền cọc");
        String deposit = sc.nextLine();
        System.out.println("Tổng tiền thanh toán");
        String totalPay = sc.nextLine();
        contractSet.add(new Contracts(numContact, idBooking, deposit, totalPay, idCustomer));
        FileUtils.writeFile(covertContactToString(), PATH_FILE);
    }


    @Override
    public void display() {
        for (Contracts contracts : contractSet) {
            System.out.println(contracts);
        }
    }

    public List<String> covertContactToString() {
        List<String> stringList = new ArrayList<>();
        for (Contracts contracts : contractSet) {
            stringList.add(contracts.toString());
        }
        return stringList;
    }


    public Set<Contracts> readFile() {
        List<String> stringList = FileUtils.readFile(PATH_FILE);
        for (String str : stringList) {
            String[] arr = str.split(",");
            contractSet.add(new Contracts(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4]));
        }
        return contractSet;
    }
}
