package CaseStudy.controllers;

import CaseStudy.service.CustomerService;
import CaseStudy.service.EmployeeService;

import java.util.Scanner;

import static CaseStudy.util.CommonUtil.getChoice;

public class FuramaController {
    static EmployeeService employeeService = new EmployeeService();
    static CustomerService customerService = new CustomerService();
    private static Scanner sc = new Scanner(System.in);
    public static void MainMenu() {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1.Employee Management\n2. Customer Management\n3. Facility Management\n4. Booking Management\n5. Promotion Management\n6.Exit");
            int choice = getChoice(1, 6);
            switch (choice) {
                case 1 -> EmployeeManagement();
                case 2 -> CustomerManagement();
//                case 3 -> FacilityManagement();
//                case 4 -> BookingManagement();
//                case 5 -> PromotionManagement();
                case 6 -> System.exit(0);
            }
        }
    }
    public static void EmployeeManagement() {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1.Display\n2. Add\n3. Edit\n4. Return");
            int choice = getChoice(1, 4);
            switch (choice) {
                case 1 -> employeeService.display();
                case 2 -> employeeService.create();
                case 3 -> employeeService.edit();
                case 4 -> MainMenu();
            }
        }
    }
    public static void CustomerManagement() {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1.Display\n2. Add\n3. Edit\n4. Return");
            int choice = getChoice(1, 4);
            switch (choice) {
                case 1 -> customerService.display();
                case 2 -> customerService.create();
                case 3 -> customerService.edit();
                case 4 -> MainMenu();
            }
        }

    }
//    public static void FacilityManagement() {
//        while (true) {
//            System.out.println("--- Main Menu ---");
//            System.out.println("1.Display\n2. Add\n3. Edit\n4. Return");
//            int choice = getChoice(1, 4);
//            switch (choice) {
//                case 1 -> Display();
//                case 2 -> Add();
//                case 3 -> Edit();
//                case 4 -> Return(); //System.exit(0);
//            }
//        }
//
//    }
//    public static void BookingManagement() {
//        while (true) {
//            System.out.println("--- Main Menu ---");
//            System.out.println("1.Display list booking\n2. Add\n3. Edit\n4. Display list contracts");
//            int choice = getChoice(1, 6);
//            switch (choice) {
//                case 1 -> Display();
//                case 2 -> Add();
//                case 3 -> Edit();
//                case 4 -> DisplayListContracts(); //System.exit(0);
//                case 5 -> EditContracts(); //System.exit(0);
//                case 6 -> Return(); //System.exit(0);
//            }
//        }
//
//    }
//    public static void PromotionManagement() {
//        while (true) {
//            System.out.println("--- Main Menu ---");
//            System.out.println("1.Display\n2. Add\n3. Edit\n4. Return");
//            int choice = getChoice(1, 4);
//            switch (choice) {
//                case 1 -> DisplayListService();
//                case 2 -> DisplayListVoucher();
//                case 3 -> Return(); //System.exit(0);
//            }
//        }
//
//    }
}

