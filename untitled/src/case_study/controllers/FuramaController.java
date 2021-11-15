package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
//        public void displayMainMenu() {
            Scanner input = new Scanner(System.in);
            int choice = 0;
            while (choice != 6) {
                System.out.println("1.Employee Management");
                System.out.println("2.Customer Management");
                System.out.println("3.Facility Management");
                System.out.println("4.\tBooking Management");
                System.out.println("5.\tPromotion Management");
                System.out.println("6.\tExit");
                System.out.println("Choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        while (choice != 4) {
                            System.out.println("1\tDisplay list employees");
                            System.out.println("2\tAdd new employee");
                            System.out.println("3\tEdit employee");
                            System.out.println("4\tReturn main menu");
                            System.out.println("Choice: ");
                            choice = input.nextInt();
//
                        }
                        break;
                    case 2:
                        while (choice != 4) {
                            System.out.println("1.\tDisplay list customers");
                            System.out.println("2.\tAdd new customer");
                            System.out.println("3.\tEdit customer");
                            System.out.println("4.\tReturn main menu");
                            System.out.println("Choice: ");
                            choice = input.nextInt();
//
                        }
                        break;
                    case 3:
                        while (choice != 4) {
                            System.out.println("1\tDisplay list facility");
                            System.out.println("2\tAdd new facility");
                            System.out.println("3\tDisplay list facility maintenance");
                            System.out.println("4\tReturn main menu");
                            System.out.println("Choice: ");
                            choice = input.nextInt();
//
                        }
                        break;
                    case 4:
                        while (choice != 6) {
                            System.out.println("1.\tAdd new booking");
                            System.out.println("2.\tDisplay list booking");
                            System.out.println("3.\tCreate new constracts");
                            System.out.println("4.\tDisplay list contracts");
                            System.out.println("5.\tEdit contracts");
                            System.out.println("6.\tReturn main menu");
                            System.out.println("Choice: ");
                            choice = input.nextInt();
//
                        }
                        break;
                    case 5:
                        while (choice != 3) {
                            System.out.println("1.\tDisplay list customers use service");
                            System.out.println("2.\tDisplay list customers get voucher");
                            System.out.println("3.\tReturn main menu");
                            System.out.println("Choice: ");
                            choice = input.nextInt();
                        }
                        break;
                    case 6:
                        System.exit(6);
                        break;

                }
            }
        }
    }

