package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {234, 23,23, 4345, 64, 234};
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Nhập phần tử cần xóa: ");
        x = input.nextInt();
     for (int i=0;i<array.length;i++){
         if (array[i]==x){
             for (int j=i;j<array.length-1;j++){
                 array[j]=array[j+1];
             }
             array[array.length-1]=0;
             i--;
         }
     }
        System.out.print("mảng sau khi xóa: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
