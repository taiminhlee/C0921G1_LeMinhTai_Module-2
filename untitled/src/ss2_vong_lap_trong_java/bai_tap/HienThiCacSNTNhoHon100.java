package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSNTNhoHon100 {
    public static void main(String[] args) {
        int numbers = 2;
        while (numbers < 100) {
            for (int i = 2; i < Math.sqrt(numbers); i++) {
                if (numbers % i == 0) {
                    break;
                }
            }
            System.out.println(numbers);
            numbers++;
        }
    }
}
