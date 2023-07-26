package Product_update.view;


import Product_update.exception.NotFoundProductException;
import Product_update.model.Authentic;
import Product_update.model.HandGood;

import Product_update.service.AuthenticServices;
import Product_update.service.HandGoodService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static Product_update.util.CommonUtil.*;

public class MainMenu {
    private static Scanner sc = new Scanner(System.in);
    private static AuthenticServices authenticServices = new AuthenticServices();
    private static HandGoodService handGoodService = new HandGoodService();

    public static void main(String[] args) throws NotFoundProductException {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Exit");
            int choice = getChoice(1, 5);
            switch (choice) {
                case 1 -> add();
                case 2 -> display();
                case 3 -> delete();
                case 4 -> search();
                case 5 -> System.exit(0);
            }
        }
    }

    private static void display() {
        System.out.println("1. Authentic\n2. HandGood");
        int choice = getChoice(1, 2);
        switch (choice) {
            case 1: {
                List<Authentic> authenticList = authenticServices.findAll();
                if (authenticList.size() > 0) {
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", "Id", "Name", "Price", "Manufacturer", "Warranty");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------");

                    for (Authentic t : authenticList) {
                        System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", t.getId(), t.getName(), t.getPrice(), t.getManufacturer(), t.getWarranty());
                    }
                } else {
                    System.out.println("Empty list...");
                }
                break;
            }
            case 2: {
                List<HandGood> handGoodList = handGoodService.findAll();
                if (handGoodList.size() > 0) {
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %n", "Id", "Name", "Price", "Manufacturer", "Country", "Status");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------");

                    for (HandGood k : handGoodList) {
                        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %n", k.getId(), k.getName(), k.getPrice(), k.getManufacturer(), k.getCountry(), k.getStatus());
                    }
                } else {
                    System.out.println("Empty list...");
                }
                break;
            }
        }
    }

    private static void delete() {
//        List<Authentic> authenticList = authenticServices.findAll();
//        List<HandGood> handGoodList = handGoodService.findAll();

//        try {
//            System.out.printf("Enter id  to delete:");
//            int id = Integer.parseInt(sc.nextLine());
//            authenticServices.delete(id);
//
//        } catch (NotFoundProductException e) {
//            e.printStackTrace();;
//        }
        System.out.println("1. Authentic\n2. HandGood");
        int choice = getChoice(1, 2);
        switch (choice) {
            case 1: {
                try {
                    int id = inputToInteger("Enter id to delete");
                    authenticServices.delete(id);
                } catch (NotFoundProductException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case 2: {
                try {
                    int id = inputToInteger("Enter id to delete");
                    handGoodService.delete(id);
                } catch (NotFoundProductException e) {
                    System.out.println(e.getMessage());
                }
            }
            break;
        }
    }
    private static void search() {
        String name = inputWithOutEmpty("Enter name to search");

        List<Authentic> authenticList = authenticServices.search(name);
        List<HandGood> handGoodList = handGoodService.search(name);

        if (authenticList.size() == 0 && handGoodList.size() == 0) {
            System.out.println("No product exists");
        } else {
            authenticList.forEach(System.out::println);
            handGoodList.forEach(System.out::println);
        }
    }

    private static void add() {
        System.out.println("1.Authentic\n2.HandGood");
        int choice = getChoice(1, 2);
        String namenew = inputWithOutEmpty("Enter name");
        int pricenew = inputToInteger("Enter price");
        String manufacturernew = inputWithOutEmpty("Enter manufacturer");
        Authentic authentic = null;
        HandGood handGood = null;
        switch (choice) {
            case 1 -> {
                int warrantynew = inputToInteger("Enter warranty");
                Authentic authentic1 = new Authentic(0, namenew, pricenew, manufacturernew, warrantynew);
                authenticServices.create(authentic1);
                System.out.println("Created successfully!");
            }
            case 2 -> {
                String countrynew = inputWithOutEmpty("Enter country");
                String statusnew = inputWithOutEmpty("Enter status");
                HandGood handGood1 = new HandGood(0, namenew, pricenew, manufacturernew, countrynew, statusnew);
                handGoodService.create(handGood1);
                System.out.println("Created successfully!");
            }
        }
    }
}