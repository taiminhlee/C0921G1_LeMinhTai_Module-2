package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMangBangPhuongThuc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.print("Do not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        int index =minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index =0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index =i;
            }
        }
        return index;
    }
}
