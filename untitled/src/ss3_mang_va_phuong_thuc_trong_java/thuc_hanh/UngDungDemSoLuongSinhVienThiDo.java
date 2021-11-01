package ss3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        Scanner input=new Scanner(System.in);
        System.out.print("Nhập số lượng mảng: ");
        size =input.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+":");
            arr[i]=input.nextInt();
        }
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>=5&&arr[i]<=10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
