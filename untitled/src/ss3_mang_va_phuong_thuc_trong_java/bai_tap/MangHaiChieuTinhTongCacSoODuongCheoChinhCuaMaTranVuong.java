package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class MangHaiChieuTinhTongCacSoODuongCheoChinhCuaMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Nhập độ dài mảng: ");
        size = input.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử [" + i + "]" + "[" + j + "]");
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][(size - 1) - i];
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += arr[i][i];
        }
        System.out.println(sum1);
    }
}

