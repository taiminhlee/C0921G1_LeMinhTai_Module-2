package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i <7; i++) {
                        for (int j = 6; j >i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i <6 ; i++) {
                        for (int j = 0; j <6 ; j++) {
                            if (j<6-i){
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i <6 ; i++) {
                        for (int j = 0; j <6 ; j++) {
                            if (j<i){
                                System.out.print(" ");
                            }else {
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <7 ; i++) {
                        for (int j = 0; j <(7*2-1)/2-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i*2-1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
