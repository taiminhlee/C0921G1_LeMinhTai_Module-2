package review.services;

import review.controllers.ExperienceFile;
import review.models.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceImpl implements Service {
    static List<Experience> experienceList = new ArrayList<>();
    static ExperienceFile experienceFile = new ExperienceFile();
    Scanner sc = new Scanner(System.in);

    static {
        experienceList.add(new Experience(34, "Aelbrecht", "Stefan", 1999, "Paris", 45747, "Stefan@gmail.com", 0, 2, "communicate"));
        experienceFile.writeFile(new Experience(34, "Aelbrecht", "Stefan", 1999, "Paris", 45747, "Stefan@gmail.com", 0, 2, "communicate"));
    }

    @Override
    public void add() {
        System.out.println("Enter id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter firstName ");
        String firstName = sc.nextLine();
        System.out.println("Enter lastName ");
        String lastName = sc.nextLine();
        System.out.println("Enter birthDate");
        int birthDate = Integer.parseInt(sc.nextLine());
        System.out.println("Enter address");
        String address = sc.nextLine();
        System.out.println("Enter phone");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter candidateType");
        int candidateType = Integer.parseInt(sc.nextLine());
        System.out.println("Enter expInYear");
        int expInYear = Integer.parseInt(sc.nextLine());
        System.out.println("Enter proSkill");
        String proSkill = sc.nextLine();
        Experience experience = new Experience(id, firstName, lastName, birthDate, address, phone, email, candidateType, expInYear, proSkill);
        experienceList.add(experience);
        experienceFile.writeFile(experience);

    }

    @Override
    public void searchName(String name) {
        for (Experience experience : experienceList) {
            if (experience.getFirstName().equals(name) || experience.getLastName().equals(name)) {
                System.out.println(experience.toString());
            }
        }
    }

    @Override
    public void display() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Experience experience : experienceList) {
            System.out.println(experience.getFirstName() + "\t" + experience.getLastName());
        }
    }
}
