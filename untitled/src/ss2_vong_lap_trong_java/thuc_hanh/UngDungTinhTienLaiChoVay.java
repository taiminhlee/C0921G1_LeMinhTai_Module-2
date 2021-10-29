package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int month;
        double money,interestRate,totalInterest=0;
        System.out.println("Enter money: ");
        money = scanner.nextDouble();
        System.out.println("Enter interestRate: ");
        interestRate =scanner.nextDouble();
        System.out.println("Enter month: ");
        month = scanner.nextInt();
       for (int i=0;i<month;i++){
           totalInterest += money *(interestRate/100)/12 * month;
       }
        System.out.println("Total of interest: "+ totalInterest);
    }
}
