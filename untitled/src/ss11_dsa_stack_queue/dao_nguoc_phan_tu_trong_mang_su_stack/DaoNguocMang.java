package ss11_dsa_stack_queue.dao_nguoc_phan_tu_trong_mang_su_stack;


import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.println("Nhập độ dài mảng: ");
        int size=input.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1));
            stack.push(arr[i]=input.nextInt());
        }
        System.out.println("chuỗi sau khi đảo ngược");
        for (int i = 0; i <size ; i++) {
            System.out.print(stack.pop());
        }
    }
}
