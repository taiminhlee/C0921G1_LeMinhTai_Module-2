package ss11_dsa_stack_queue.dao_nguoc_phan_tu_trong_mang_su_stack;
import java.util.*;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Stack<String> stack=new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String string=input.nextLine();
        for (int i = 0; i <string.length() ; i++) {
            stack.push(string.charAt(i)+"");
        }
        System.out.println("chuỗi sau khi đảo ngược");
        for (int i = 0; i <string.length() ; i++) {
            System.out.print(stack.pop());
        }
    }
}
