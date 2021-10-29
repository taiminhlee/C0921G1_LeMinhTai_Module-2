package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int usd,vnd;
        System.out.println("Nhập đô la Mỹ: ");
        usd = scanner.nextInt();
        vnd = 23000 * usd;
        System.out.println(usd + " USD = "+ vnd+" VND");
    }
}
