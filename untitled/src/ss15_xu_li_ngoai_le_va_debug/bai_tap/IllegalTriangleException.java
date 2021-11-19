package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import ss15_xu_li_ngoai_le_va_debug.thuc_hanh.su_dung_lop_NumberFormatException.CalculationExample;

import java.util.Scanner;

public class IllegalTriangleException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Hãy nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Hãy nhập c: ");
        int c = scanner.nextInt();
        try {
            illegalTriangle(a, b, c);
        } catch (IllegalTringle e) {
          e.printStackTrace();
        }
    }

    private static void illegalTriangle(int a, int b, int c) throws IllegalTringle{
        if (a > 0 && b > 0 && c > 0
                && a + b > 0 && a + c > 0 && b + c > a) {
            System.out.println("đây là ba cạnh tam giác");
        }else throw new IllegalTringle("Đây không phải là 3 cạnh tam giác");

    }
}
