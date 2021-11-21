package review.services;

import review.models.Experience;
import review.models.Fresher;
import review.models.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternImpl implements Service {
    static List<Intern> interns = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static {
        interns.add(new Intern(5, "Maria", "Madeleine", 2000, "Munich", 947204, "Maria@gmail.com", 2, "interpreter", "semester 3", "Oxford"));
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
        System.out.println("Enter majors");
        String majors = (sc.nextLine());
        System.out.println("Enter semester");
        String semester = sc.nextLine();
        System.out.println("Enter universityName");
        String universityName = sc.nextLine();
        interns.add(new Intern(id, firstName, lastName, birthDate, address, phone, email, candidateType, majors, semester, universityName));
    }

    @Override
    public void searchName(String name) {
        for (Intern intern : interns) {
            if (intern.getFirstName().equals(name) || intern.getLastName().equals(name)) {
                System.out.println(intern.toString());
            }
        }
    }

    @Override
    public void display() {
        System.out.println("===========INTERN CANDIDATE==============");
        for (Intern intern : interns) {
            System.out.println(intern.getFirstName()+"\t"+intern.getLastName());
        }
    }
}
