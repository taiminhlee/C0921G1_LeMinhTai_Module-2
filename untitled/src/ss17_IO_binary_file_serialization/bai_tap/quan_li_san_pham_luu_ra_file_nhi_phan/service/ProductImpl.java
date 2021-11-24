package ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.service;

import review.models.Experience;
import ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements Service {
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    {
        products = ReadWriteFile.readFile();
    }

    @Override
    public void add() {
        System.out.println("Please enter id");
        String id = (scanner.nextLine());
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter manufacturer");
        String manufacturer = (scanner.nextLine());
        System.out.println("Please enter price");
        String price = (scanner.nextLine());
        System.out.println("Please enter description");
        String description = (scanner.nextLine());
        products.add(new Product(id, name, manufacturer, price, description));
        ReadWriteFile.writeFile(products);
    }

    @Override
    public void display() {
        products = ReadWriteFile.readFile();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id");
        String id=scanner.nextLine();
        for (Product product: products) {
            if (product.getId().equals(id)) {
                products.remove(product);
            }
        }ReadWriteFile.writeFile(products);
    }

    @Override
    public void search() {
        System.out.println("Enter id");
        String id = scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equals(name) || product.getId().equals(id)) {
                System.out.println(product.toString());
            }
        }
    }
}
