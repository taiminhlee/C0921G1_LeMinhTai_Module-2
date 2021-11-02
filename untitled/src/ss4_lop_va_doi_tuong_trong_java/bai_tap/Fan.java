package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class Fan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Nhập tốc độ quạt");
        int speed=Integer.parseInt(input.nextLine());
        System.out.print("Nhập bán kính quạt");
        double radius=Double.parseDouble(input.nextLine());
//        input.skip("\\R");
        System.out.print("Màu: ");
        String color =input.nextLine();
        System.out.print("Bật/Tắt");
        boolean on =input.nextBoolean();
        XayDungLopFan fan =new XayDungLopFan(speed,radius,color,on);
        System.out.println(fan.toString());
    }
}
