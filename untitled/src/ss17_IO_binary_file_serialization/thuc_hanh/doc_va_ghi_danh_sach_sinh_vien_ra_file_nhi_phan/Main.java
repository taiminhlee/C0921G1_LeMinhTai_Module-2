package ss17_IO_binary_file_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        FileOutputStream fos =null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert oos != null;
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois=null;
        try{
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();

        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                assert fis != null;
                fis.close();
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public static void main(String[] args) {
        final String PATH_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss17_IO_binary_file_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan\\student.csv";
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(PATH_FILE,students);
        List<Student> studentDataFromFile = readDataFromFile(PATH_FILE);
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
