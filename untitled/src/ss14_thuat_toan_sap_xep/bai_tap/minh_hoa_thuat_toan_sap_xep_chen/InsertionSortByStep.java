package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);

    }

    public static void insertionSortByStep(int[] list) {
        boolean needNextPass;
        int pos, x;
        for (int k = 1; k < list.length; k++) {
            for (int i = 1; i < list.length; i++) {
                x = list[i];
                pos = i;
                while (pos > 0 && x < list[pos - 1]) {
                    System.out.println("Swap " + list[pos] + " with " + list[pos - 1]);
                    list[pos] = list[pos - 1];
                    pos--;
                }
                list[pos] = x;
            }
        }
        System.out.print("List after the  sort: ");
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }
}
