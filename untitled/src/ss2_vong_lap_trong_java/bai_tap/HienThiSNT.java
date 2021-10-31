package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiSNT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers, count = 0, n = 1;
        System.out.print("Nhập số lượng cần in ra: ");
        numbers = input.nextInt();
        while (count < numbers) {
            boolean flag = true;
            if (n >= 2) {
                for (int i = 2; i < n-1; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }

    }
}
