package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year =scanner.nextInt();
       boolean isLeapYear =false;
       boolean isDivisibleBy4 =year %4==0;
       if (isDivisibleBy4){
           boolean isDivisibleBy100 = year % 100==0;
           if (isDivisibleBy100){
               boolean isDivisible400 =year % 400==0;
               if (isDivisible400){
                   isLeapYear = true;
               }
           }else {
               isLeapYear =true;
           }
       }
       if (isLeapYear){
           System.out.println(year + " is a leap year");
       }else {
           System.out.println(year + " is NOT a leap year");
       }
    }
}
