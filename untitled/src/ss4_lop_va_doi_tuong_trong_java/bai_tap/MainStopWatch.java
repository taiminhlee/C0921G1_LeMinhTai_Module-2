package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch time=new StopWatch();

       time.start();
        System.out.println( time.getStartTime());
        for (int i = 0; i <100000 ; i++) {
            time.stop();
            System.out.println(time.getEndTime());
        }

        System.out.println(time.getElapsedTime());
    }
}
