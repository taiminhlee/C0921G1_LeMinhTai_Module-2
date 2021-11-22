package review.controllers;

import review.models.Experience;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExperienceFile {
    static final String PATH_FILE="G:\\codegym\\C0921G1-LeMinhTai-module-2\\untitled\\src\\review\\data\\experience.csv";
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
                        + " , expInYear=" + element.get(8)
                        + " , proSkill=" + element.get(9)
                        + "]");
    }

    public void writeFile(Experience  element) {
        final String COMMA = ",";
        File file = new File(PATH_FILE);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(element.getId() + COMMA + element.getFirstName() + COMMA + element.getLastName()+COMMA +
                    element.getBirthDate()+COMMA+element.getAddress()+COMMA+element.getPhone()+COMMA+element.getEmail()+COMMA+
                    element.getCandidateType()+COMMA+element.getExpInYear()+COMMA+element.getProSkill()+ "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert bufferedWriter != null;
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

