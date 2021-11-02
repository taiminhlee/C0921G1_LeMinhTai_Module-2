package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

  class PhuongTrinhBacHai {
    int a, b, c;

    public PhuongTrinhBacHai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getDetal() {
        return b*2 - 4 * a * c;
    }

    public double getNghiem1() {
       return  (-b + Math.pow(((Math.pow(b, 2)) - 4 * a * c), 0.5)) / 2 * a;
    }
    public double getNghiem2(){
        return  (-b - Math.pow(((Math.pow(b, 2)) - 4 * a * c), 0.5)) / 2 * a;
    }

}
class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int heSoA,heSoB,heSoC;
        System.out.print("Nhập a: ");
        heSoA=input.nextInt();
        System.out.print("Nhập b: ");
        heSoB=input.nextInt();
        System.out.print("Nhập c: ");
        heSoC=input.nextInt();
        PhuongTrinhBacHai phuongTrinhBacHai=new PhuongTrinhBacHai(heSoA,heSoB,heSoC);
        System.out.println("Detal = "+phuongTrinhBacHai.getDetal());
        if (phuongTrinhBacHai.getDetal()>0){
            System.out.print("Nghiệm thứ nhất: "+phuongTrinhBacHai.getNghiem1());
            System.out.print("Nghiệm thứ hai: "+phuongTrinhBacHai.getNghiem2());
        }else if (phuongTrinhBacHai.getDetal()==0){
            System.out.print("Phương trình có nghiệm kép: "+phuongTrinhBacHai.getNghiem1());
        }else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}

