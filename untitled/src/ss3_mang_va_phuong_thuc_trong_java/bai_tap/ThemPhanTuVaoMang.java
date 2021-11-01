package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {234, 2, 43, 264, 43};
        Scanner input = new Scanner(System.in);
        int element, index;
        System.out.print("Nhập phần tử cần chén: ");
        element = input.nextInt();
        System.out.print("Nhập vị trí cần chén: ");
        index = input.nextInt();
        if (index <= -1 || index > array.length) {
            System.out.print("Không thể chèn");
        } else {
            array = Arrays.copyOf(array, array.length + 1);
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;

        }
        System.out.print("mảng sau khi chèn: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
