package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_licnkedlist_trong_java_collection_framework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();

    public void toAdd() {
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = Double.parseDouble(scanner.nextLine());
        products.add(new Product(id, name, price));
        products.add(new Product(1, "nokia", 16.000));
        products.add(new Product(3, "samsung", 20.000));
        products.add(new Product(2, "iphone", 25.000));
    }

    public void remove() {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        boolean flag = false;
        int id = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("id không có");
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayByName() {
        System.out.println("Nhập vào tên sản phẩm muốn tìm");
        String name = scanner.nextLine();
        boolean flag = false;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println("Sản phẩm đang tìm: " + product);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Sản phẩm không tồn tại");
    }

    public void editById() {
        System.out.println("Nhập id  sản phẩm muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Nhập tên sản phẩm cần sửa: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá cần sửa: ");
                double price = Double.parseDouble(scanner.nextLine());
                product.setName(name);
                product.setPrice(price);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Sản phẩm không tồn tại");
    }

    public void editSortUp(){
        products.sort((o1, o2) -> (int) (o2.getPrice()-o1.getPrice()));

    }
    public void editSortDown(){
        System.out.println("sau khi săp xếp giảm dần");
        products.sort((o1, o2) -> (int) (o1.getPrice()-o2.getPrice()));

    }

}

