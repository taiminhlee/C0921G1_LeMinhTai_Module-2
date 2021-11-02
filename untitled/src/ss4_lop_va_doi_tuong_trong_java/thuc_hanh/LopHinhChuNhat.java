package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class LopHinhChuNhat {
    double width, height;

    public LopHinhChuNhat() {
    }

    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + this.width + ", height=" + this.height + "}";
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        LopHinhChuNhat hinhChuNhat = new LopHinhChuNhat(width, height);
        System.out.println("Your Rectangle \n" + hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: " + hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: " + hinhChuNhat.getArea());
    }
}
