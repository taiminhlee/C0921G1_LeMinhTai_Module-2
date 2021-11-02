package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr = "abbcccd";
        int count = 0;
        System.out.print("Nhập kí tự: ");
        char kyTu = input.nextLine().charAt(0);
        for (int i = 0; i < arr.length(); i++) {
            if (kyTu == arr.charAt(i)) {
                count++;
            }
        }
        System.out.println("ký tự " + kyTu + " xuất hiện " + count + " lần");
    }
}
