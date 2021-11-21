package review.controllers;

import review.services.ExperienceImpl;
import review.services.FresherImpl;
import review.services.InternImpl;

import java.util.Scanner;

public class CandidateControllers {
    public void display() {

        Scanner input = new Scanner(System.in);
        ExperienceImpl experience = new ExperienceImpl();
        FresherImpl fresher = new FresherImpl();
        InternImpl intern = new InternImpl();
        int choice = 0;
        while (choice != 5) {
            System.out.println("1.Experience");
            System.out.println("2.Fresher");
            System.out.println("3.Internship");
            System.out.println("4.Searching");
            System.out.println("5.Exit");
            System.out.println("Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 5) {
                        String yesOrNo = input.nextLine();
                        if (yesOrNo.equals("n")) {
                            choice = 5;
                        }
                        experience.add();
                        System.out.println("Do you want to continue (Y/N)?");
                    }
                    break;
                case 2:
                    while (choice != 6) {
                        String yesOrNo = input.nextLine();
                        fresher.add();
                        System.out.println("Do you want to continue (Y/N)?");
                        if (yesOrNo.equals("n")) {
                            choice = 6;
                        }
                    }
                    break;
                case 3:
                    while (choice != 7) {
                        String yesOrNo = input.nextLine();
                        if (yesOrNo.equals("n")) {
                            choice = 7;
                        }
                        intern.add();
                        System.out.println("Do you want to continue (Y/N)?");
                    }
                    break;
                case 4:
                    while (choice != 8) {
                        System.out.println("Do you want continue Y/N");
                        String yesOrNo = input.nextLine();
                        if (yesOrNo.equals("n")) {
                            choice = 8;
                        }
                        experience.display();
                        fresher.display();
                        intern.display();
                        System.out.println("Enter Candidate Name: ");
                        String name = input.nextLine();
                        System.out.println("Enter Candidates type:");
                        int type = input.nextInt();

                        if (type == 0) {
                            experience.searchName(name);
                        } else if (type == 1) {
                            fresher.searchName(name);
                        } else if (type == 2) {
                            intern.searchName(name);
                        }


                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
            }

        }
    }
}
