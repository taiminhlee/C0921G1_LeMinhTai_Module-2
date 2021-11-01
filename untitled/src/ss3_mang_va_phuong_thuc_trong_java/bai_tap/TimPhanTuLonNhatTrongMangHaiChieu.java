package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import javax.swing.*;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        int[][] array={
                {2,42,53,234},
                {534,6,4,76}
        };
        int max =array[0][0];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.print(max);
    }

}
