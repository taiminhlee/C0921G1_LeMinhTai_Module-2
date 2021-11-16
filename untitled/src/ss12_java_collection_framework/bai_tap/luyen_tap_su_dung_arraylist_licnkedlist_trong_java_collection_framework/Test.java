package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_licnkedlist_trong_java_collection_framework;


public class Test {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        product.toAdd();
        product.display();
        product.remove();
        product.displayByName();
        product.editById();
        product.editSortUp();
        product.display();
        product.editSortDown();
        product.display();
    }
}
