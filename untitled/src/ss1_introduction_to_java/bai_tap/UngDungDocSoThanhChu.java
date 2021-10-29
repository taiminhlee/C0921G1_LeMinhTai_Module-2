package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num2, num3 = 0;
        String str = null;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if (num > 99 && num < 1000) {
            num2 = num % 100;
            num3 = num - num2;
        } else {
            num2 = num;
        }
        if (num2 >= 0 && num2 < 10) {
            switch (num2) {
                case 0:
                    str = "zero";
                    break;
                case 1:
                    str = "one";
                    break;
                case 2:
                    str = "two";
                    break;
                case 3:
                    str = "three";
                    break;
                case 4:
                    str = "four";
                    break;
                case 5:
                    str = "five";
                    break;
                case 6:
                    str = "six";
                    break;
                case 7:
                    str = "seven";
                    break;
                case 8:
                    str = "eight";
                    break;
                case 9:
                    str = "nine";
                    break;
//                default:
//                    System.out.println("out of ability");
//                    break;
            }
        } else if (num2 < 20) {
            switch (num2 - 10) {
                case 0:
                    str = "ten";
                    break;
                case 1:
                    str = "eleven";
                    break;
                case 2:
                    str = "twelve";
                    break;
                case 3:
                    str = "thirteen";
                    break;
                case 4:
                    str = "fourteen";
                    break;
                case 5:
                    str = "fifteen";
                    break;
                case 6:
                    str = "sixteen";
                    break;
                case 7:
                    str = "seventeen";
                    break;
                case 8:
                    str = "eighteen";
                    break;
                case 9:
                    str = "nineteen";
                    break;
            }
        } else if (num2 < 100) {
            String strTens = "";
            String strOnes = "";
            switch (num2 % 10) {
                case 1:
                    strOnes = "one";
                    break;
                case 2:
                    strOnes = "two";
                    break;
                case 3:
                    strOnes = "three";
                    break;
                case 4:
                    strOnes = "four";
                    break;
                case 5:
                    strOnes = "five";
                    break;
                case 6:
                    strOnes = "six";
                    break;
                case 7:
                    strOnes = "seven";
                    break;
                case 8:
                    strOnes = "eight";
                    break;
                case 9:
                    strOnes = "nine";
                    break;
            }
            switch (num2 - num2 % 10) {
                case 20:
                    strTens = "twenty ";
                    break;
                case 30:
                    strTens = "thirty ";
                    break;
                case 40:
                    strTens = "forty ";
                    break;
                case 50:
                    strTens = "fifty ";
                    break;
                case 60:
                    strTens = "sixty ";
                    break;
                case 70:
                    strTens = "seventy ";
                    break;
                case 80:
                    strTens = "eighty ";
                    break;
                case 90:
                    strTens = "ninety ";
                    break;
            }
            str = strTens + strOnes;
        }
        String strH = null;
        if (num < 1000 && num > 99) {
            switch (num3) {
                case 100:
                    strH = "one";
                    break;
                case 200:
                    strH = "two";
                    break;
                case 300:
                    strH = "three";
                    break;
                case 400:
                    strH = "four";
                    break;
                case 500:
                    strH = "five";
                    break;
                case 600:
                    strH = "six";
                    break;
                case 700:
                    strH = "seven";
                    break;
                case 800:
                    strH = "eight";
                    break;
                case 900:
                    strH = "nine";
                    break;
            }
            strH = strH + " hundred ";
            if (num2 == 0) {
                str = "";
            }
            str = strH + str;
        }
        System.out.println(str);
    }
}