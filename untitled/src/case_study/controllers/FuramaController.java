package case_study.controllers;

import case_study.Services.booking.BookingServiceImpl;
import case_study.Services.customer.CustomerServiceImpl;
import case_study.Services.employee.EmployeeServiceImpl;
import case_study.Services.facility.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
        public void displayMainMenu() {
            EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
            CustomerServiceImpl customerService=new CustomerServiceImpl();
            FacilityServiceImpl facilityService=new FacilityServiceImpl();
            BookingServiceImpl bookingService=new BookingServiceImpl();
            Scanner input = new Scanner(System.in);
            int choice = 0;
            while (true){
                try {
                    while (choice != 6) {
                        System.out.println("1.Employee Management");
                        System.out.println("2.Customer Management");
                        System.out.println("3.Facility Management");
                        System.out.println("4.Booking Management");
                        System.out.println("5.Promotion Management");
                        System.out.println("6.Exit");
                        System.out.println("Choice: ");
                        choice =input.nextInt();
                        switch (choice) {
                            case 1:
                                while (choice != 4) {
                                    System.out.println("1\tDisplay list employees");
                                    System.out.println("2\tAdd new employee");
                                    System.out.println("3\tEdit employee");
                                    System.out.println("4\tReturn main menu");
                                    System.out.println("Choice: ");
                                    choice = input.nextInt();
                                    switch (choice){
                                        case 1:
                                            employeeService.display();
                                            break;
                                        case 2:
                                            employeeService.add();
                                            break;
                                        case 3:
                                            employeeService.edit();
                                            break;
                                    }
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
                                    switch (choice){
                                        case 1:
                                            customerService.display();
                                            break;
                                        case 2:
                                            customerService.add();
                                            break;
                                        case 3:
                                            customerService.edit();
                                            break;
                                    }
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
                                    switch (choice){
                                        case 1:
                                            facilityService.display();
                                            break;
                                        case 2:
                                            facilityService.add();
                                            break;
                                        case 3:
                                            facilityService.displayMaintenance();
                                            break;
                                    }
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
                                    switch (choice){
                                        case 1:
                                            bookingService.add();
                                            break;
                                        case 2:
                                            bookingService.display();
                                            break;
                                        case 3:
                                            facilityService.displayMaintenance();
                                            break;
                                        case 4:
                                            break;

                                    }
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
                                break;
                        }
                    }
                    break;
                }catch (Exception e){
                    System.err.println("Nhập lỗi");
                }
            }

        }
    }

