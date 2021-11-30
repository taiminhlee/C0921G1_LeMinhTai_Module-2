package case_study.Services;

import case_study.models.Booking;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static List<String> readFile(String pathFile){
           List<String> listLine =new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader;
        BufferedReader br = null;
        try {
            String line;
            fileReader =new FileReader(file);
            br=new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
               listLine.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listLine;
    }

    public static void writeFile(List<String> stringList,String pathFile){
        File file =new File(pathFile);
        FileWriter fileWriter;
        BufferedWriter bf=null;
        try {
            fileWriter=new FileWriter(file);
            bf=new BufferedWriter(fileWriter);
            for (String line: stringList) {
                bf.write(line);
                bf.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert bf != null;
                bf.flush();
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
