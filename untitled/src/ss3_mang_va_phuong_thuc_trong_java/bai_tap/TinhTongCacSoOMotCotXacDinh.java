package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hang,cot;
        int count = 0;
        System.out.print("Nhập độ dài hàng");
        hang = input.nextInt();
        System.out.print("Nhập độ dài cột");
        cot = input.nextInt();
        int[][] arr = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ"+ "["+i+"]"+"["+j+"]");
                arr[i][j] = input.nextInt();
            }
        }
        int choice;
        System.out.println("Nhập cột cần tính");
        choice = input.nextInt();
        if (choice>=0&&choice<cot){
            for (int i = 0; i < hang; i++) {
                count += arr[i][choice];
            }
            System.out.println(count);
        }else {
            System.out.println("Nhập lại");
        }
    }
}
