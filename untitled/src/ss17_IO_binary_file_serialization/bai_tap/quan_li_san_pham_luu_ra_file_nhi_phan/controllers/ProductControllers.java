package ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.controllers;

import ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.service.ProductImpl;

import java.util.Scanner;

public class ProductControllers {

    Scanner scanner = new Scanner(System.in);
    ProductImpl product = new ProductImpl();

    public void menu() {
        int choice;
        while (true) {
            System.out.println("Please choice:\n" +
                    "1. Add \n" +
                    "2. Delete \n" +
                    "3. Display \n" +
                    "4. Search \n" +
                    "5. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    product.add();
                    break;
                case 2:
                    product.delete();
                    break;
                case 3:
                   product.display();
                   break;
                case 4:
                    product.search();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
