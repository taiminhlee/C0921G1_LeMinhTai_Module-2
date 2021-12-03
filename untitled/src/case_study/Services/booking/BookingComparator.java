package case_study.Services.booking;

import case_study.models.Booking;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class BookingComparator implements Comparator<Booking> {
    Date date1 ;
    Date date2 ;

    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.getNgayBatDau().equals(o2.getNgayBatDau())) {
            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getNgayKetThuc());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getNgayKetThuc());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getNgayBatDau());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getNgayBatDau());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date1.compareTo(date2);
    }

}
