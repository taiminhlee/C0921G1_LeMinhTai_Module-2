package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Enter your height: ");
        height = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.println(  " Underweight");
        else if (bmi<25.0)
            System.out.println( " Normal");
        else if (bmi<30.0)
            System.out.println( " Overweight");
        else
            System.out.println( " Obese");
    }
}
