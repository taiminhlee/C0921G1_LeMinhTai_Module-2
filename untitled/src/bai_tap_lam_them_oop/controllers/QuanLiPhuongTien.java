package bai_tap_lam_them_oop.controllers;

import java.util.Scanner;

public class QuanLiPhuongTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int choice = 0;
        while (choice !=4){
            System.out.println("1.Thêm mới phương tiện.");
            System.out.println("2.Hiện thị phương tiện");
            System.out.println("3.Xóa phương tiện");
            System.out.println("4.Thoát");
            System.out.println("Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 5) {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm ôtô");
                        System.out.println("3. Thêm  xe máy.");
                        System.out.println("4. Thoát");
                        System.out.println("Choice: ");
                        choice = input.nextInt()+1;
                    }
                    break;
                case 2:
                    while (choice != 5) {
                        System.out.println("1. Hiện thị xe tải.");
                        System.out.println("2. Hiện thị ôtô. ");
                        System.out.println("3. Hiện  xe máy.");
                        System.out.println("4. Thoát");
                        System.out.println("Choice: ");
                        choice = input.nextInt()+1;

                    }
                    break;
                case 3:
                    while (choice != 5) {
                        System.out.println("1. Nhập biển kiểm soát");
                        System.out.println("2. Thoát");
                        choice = input.nextInt()+3;
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        } 
    }
}
