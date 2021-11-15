package ss11_dsa_stack_queue.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] arr = string.toLowerCase().split("");
        Stack<String> stack = new Stack<>();
        boolean check = true;
        for (int i = 0; i < arr.length / 2; i++) {
            stack.push(arr[i]);
        }
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr).subList(arr.length / 2, arr.length));
        while (stack.isEmpty()) {
                if (!stack.pop().equals(queue.poll())) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("Đây là chuỗi palindrome");
            else System.out.println("Đây không phải là chuỗi palindrome");

        }

    }
