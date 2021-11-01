package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter element "+(i+1)+":");
            array[i]=input.nextInt();
        }
        int max =array[0];
        int index =1;
        for (int i=1;i<array.length;i++){
            if (array[i]>max){
                max =array[i];
                index +=i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
