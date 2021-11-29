package case_study.Services.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner sc = new Scanner(System.in);

    public static void validateName(String str) {

        String nameRegex = "^(\\d\\s)*([A-Z][a-z]*)(\\s((\\d(\\s)*)*)([A-Z][a-z]*)*)*$";

        while (!Pattern.matches(nameRegex, str)) {
            System.err.println("Nhập lại");
            str = sc.nextLine();
        }
    }

    public static double validateArea() {
        double area;
        while (true) {
            try {
                 area = Double.parseDouble(sc.nextLine());
                if (area <= 30) {
                    System.err.println("Nhập Lớn hơn 30");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.err.println("Nhập lại");
            }
        }
        return area;
    }

    public static void validatePositive(String str) {
        String nameRegex = "^\\d+$";
        while (!Pattern.matches(nameRegex, str)) {
            System.err.println("Nhập lại");
            str = sc.nextLine();
        }
    }

    public static int validateQuantity() {
        int quantity;
        while (true) {
            try {
                quantity = Integer.parseInt(sc.nextLine());
                if (quantity < 0 || quantity > 20) {
                    System.err.println("Nhập trong khoảng từ 1 đến 20");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhập lại");
            }
        }
        return quantity;
    }
}
