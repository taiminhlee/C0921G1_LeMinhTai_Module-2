package review.controllers;

import review.services.ExperienceImpl;
import review.services.FresherImpl;
import review.services.InternImpl;

import java.util.Scanner;

public class CandidateControllers {
    Scanner input = new Scanner(System.in);
    ExperienceImpl experience = new ExperienceImpl();
    FresherImpl fresher = new FresherImpl();
    InternImpl intern = new InternImpl();

    public void display() {
        int choice;
        while (true) {
            System.out.println("1.Experience");
            System.out.println("2.Fresher");
            System.out.println("3.Internship");
            System.out.println("4.Searching");
            System.out.println("5.Exit");
            System.out.println("Choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    String check="yes";
                    while ("yes".equals(check)) {
                        experience.add();
                        System.out.println("Do you want continue (Y/N)?");
                       check=input.nextLine();
                    }
                    break;
                case 2:
                    String check1="yes";
                    while ("yes".equals(check1)) {
                        fresher.add();
                        System.out.println("Do you want to continue (Y/N)?");
                       check1=input.nextLine();
                    }
                    break;
                case 3:
                    String check2="yes";
                    while ("yes".equals(check2)) {
                        intern.add();
                        System.out.println("Do you want to continue (Y/N)?");
                      check2=input.nextLine();
                    }
                    break;
                case 4:
                    String check3="yes";
                    while ("yes".equals(check3)) {
                        experience.display();
                        fresher.display();
                        intern.display();

                        System.out.println("Enter Candidates type:");
                        int type = Integer.parseInt(input.nextLine());
                        System.out.println("Enter Candidate Name: ");
                        String name = input.nextLine();
                        if (type == 0) {
                            experience.searchName(name);
                        } else if (type == 1) {
                            fresher.searchName(name);
                        } else if (type == 2) {
                            intern.searchName(name);
                        }
                        System.out.println("Do you want to continue (Y/N)?");
                       check3=input.nextLine();
                    }
                    break;
                case 5:
                    System.exit(5);
            }
        }
    }
}
