package ss16_IO_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    private static String readFile(FileReader sourceFile) {
        int i;
        String result = "";
        int count=0;
        try {

            while ((i = sourceFile.read()) != -1) {
                result += ((char) i);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sourceFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("số kí tự của file: "+count);
        return result;

    }

    private static void writeFile(FileWriter fileWriter, String result) {
        try {
            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    final String SOURCE_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\source.csv";
    final String TARGET_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\target.csv";
        File filerSource = new File(SOURCE_FILE);
        File filerTarget = new File(TARGET_FILE);
        String result;
            try {
                FileReader fileReader = new FileReader(filerSource);
                FileWriter fileWriter = new FileWriter(filerTarget);
                 result=readFile(fileReader);
                writeFile(fileWriter, result);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
