package review.controllers;

import review.models.Intern;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InternFile {
    static final String PATH_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\review\\data\\intern.csv";
    public String readFile() {
        String line = "";
        File file = new File(PATH_FILE);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void printCountry(List<String> element) {
        System.out.println(
                " [id= "
                        + element.get(0)
                        + ", first name=" + element.get(1)
                        + " , last name=" + element.get(2)
                        + " , birth date=" + element.get(3)
                        + " , address=" + element.get(4)
                        + " , phone=" + element.get(5)
                        + " , email=" + element.get(6)
                        + " , candidate type=" + element.get(7)
                        + " , majors=" + element.get(8)
                        + " , semester=" + element.get(9)
                        + " , universityName=" + element.get(10)
                        + "]");
    }

    public void writeFile(Intern e) {
        final String COMMA = ",";
        File file = new File(PATH_FILE);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(e.getId() + COMMA + e.getFirstName() + COMMA + e.getLastName()+COMMA +
                    e.getBirthDate()+COMMA+e.getAddress()+COMMA+e.getPhone()+COMMA+e.getEmail()+COMMA+
                    e.getCandidateType()+COMMA+e.getMajors()+COMMA+e.getSemester()+COMMA+e.getUniversityName()+ "\n");
            bufferedWriter.flush();
        } catch (IOException a) {
            a.printStackTrace();
        } finally {
            assert bufferedWriter != null;
            try {
                bufferedWriter.close();
            } catch (IOException a) {
                a.printStackTrace();
            }
        }
    }
}
