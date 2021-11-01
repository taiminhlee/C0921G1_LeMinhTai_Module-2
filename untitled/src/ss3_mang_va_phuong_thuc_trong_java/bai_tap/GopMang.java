package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {234, 234, 25, 24, 53};
        int[] arr2 = {235, 34, 5, 4};
        int[] arr3;
        arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        for (int arr : arr3) {
            System.out.println(arr);
        }
    }

}
