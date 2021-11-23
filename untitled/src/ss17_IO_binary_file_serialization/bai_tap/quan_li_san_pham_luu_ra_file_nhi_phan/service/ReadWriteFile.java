package ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.service;

import ss17_IO_binary_file_serialization.bai_tap.quan_li_san_pham_luu_ra_file_nhi_phan.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    static final String PATH_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss17_IO_binary_file_serialization\\bai_tap\\quan_li_san_pham_luu_ra_file_nhi_phan\\data\\product.csv";
    public static List<Product> readFile()  {
     List<Product> product=new ArrayList<>();
        File file=new File(PATH_FILE);
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
         fileInputStream =new FileInputStream(file);
            if (fileInputStream.available() !=0){
                objectInputStream=new ObjectInputStream(fileInputStream);
                product=(List<Product>) objectInputStream.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return product;
    }
    public static void writeFile(List<Product> products){

        File file = new File(PATH_FILE);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            try{
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

