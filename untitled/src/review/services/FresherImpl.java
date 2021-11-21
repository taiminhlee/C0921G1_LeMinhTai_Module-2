package review.services;

import review.models.Experience;
import review.models.Fresher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherImpl implements Service {
    static List<Fresher> freshers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static {
        freshers.add( new Fresher(2, "Barbosa", "De Souza", 1999, "Sao paulo", 137537, "barbosa@gmail.com", 1, 3, "Good", "Kaiqkbsd")) ;
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
        System.out.println("Enter graduationDate");
        int graduationDate = Integer.parseInt(sc.nextLine());
        System.out.println("Enter GraduationRank");
        String GraduationRank = sc.nextLine();
        System.out.println("Enter education");
        String education = sc.nextLine();
        freshers.add(new Fresher(id, firstName, lastName, birthDate, address, phone, email, candidateType, graduationDate, GraduationRank, education));
    }

    @Override
    public void searchName(String name) {
        for (Fresher fresher : freshers) {
            if (fresher.getFirstName().equals(name) || fresher.getLastName().equals(name)) {
                System.out.println(fresher.toString());
            }
        }
    }
    @Override
    public void display() {
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Fresher fresher:freshers) {
            System.out.println(fresher.getFirstName()+"\t"+fresher.getLastName());
        }

    }
}
