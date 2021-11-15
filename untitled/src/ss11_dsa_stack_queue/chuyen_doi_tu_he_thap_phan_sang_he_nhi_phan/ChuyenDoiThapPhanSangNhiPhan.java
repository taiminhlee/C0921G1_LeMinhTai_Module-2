package ss11_dsa_stack_queue.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số thập phân");
        int input=scanner.nextInt();
        Stack<Integer> stack=new Stack<>();
        while (input !=0){
              stack.push(input%2);
              input/=2;
        }
        System.out.println("Giá trị số nhị phân là: ");
        while (! stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
