package ss16_IO_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
     public static void main(String[] args) {
         WriteFile writeFile=new WriteFile();
         writeFile.writeCSV(new Country(9,"'VI'","'Vietnam'"));

         BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\doc_file_csv\\countries.csv"));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
