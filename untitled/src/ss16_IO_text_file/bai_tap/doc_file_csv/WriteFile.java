package ss16_IO_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class WriteFile {
    public static String PATH_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\doc_file_csv\\countries.csv";
    public static String COMMA=",";
    public void writeCSV(Country country)  {
        File file=new File(PATH_FILE);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(country.getId()+COMMA+country.getCode()+COMMA+country.getName()+"\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert bufferedWriter != null;
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
