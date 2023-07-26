package BTLT3.view;


import BTLT3.Service.AuthenticServices1;
import BTLT3.Service.HandGoodService1;
import BTLT3.models.*;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
   static AuthenticServices1 authenticServices1 = new AuthenticServices1();
   static HandGoodService1 handGoodService1 = new HandGoodService1();
    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Delete\n4. Search\n5. Exit");
            int choice = getChoice();

            switch (choice) {
                case 1 :
                    add();
                    break;
                case 2 :
                    display();
                    break;
                case 3 : delete();
                    break;
                case 4 : search();
                    break;
                case 5 : System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
    private static int getChoice() {
        System.out.printf("Enter your choice:");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void display() {
        System.out.println("1. Authentic\n2. HandGood");
        int choice = getChoice();
        switch (choice) {
            case 1 : {
                List<Authentic1> authentic1s = authenticServices1.findAll();
                for (int i = 0; i < authentic1s.size(); i++) {
                    System.out.println(authentic1s.get(i));
                }
                break;
            }
            case 2 : {
                List<HandGood1> handGood1s = handGoodService1.findAll();
                for (int i = 0; i < handGood1s.size(); i++) {
                    System.out.println(handGood1s.get(i));
                }
                break;
            }
            default:
                return;
        }
    }
    private static void delete() {
        List<Authentic1>authentic1s= authenticServices1.findAll();
        List<HandGood1> handGood1s = handGoodService1.findAll();
        System.out.printf("Enter id  to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <authentic1s.size() ; i++) {
            if (id==authentic1s.get(i).getId()){
                authentic1s.remove(i);
            }
        }
        for (int i = 0; i < handGood1s.size() ; i++) {
            if (id== handGood1s.get(i).getId()){
                handGood1s.remove(i);
            }
        }

//        if (authenticServices.findById(id)) {
//            deleteWithConfirm((IProductService) authenticServices, id);
//        } else if (handGoodService.findById(id)) {
//            deleteWithConfirm((IProductService) handGoodService, id);
//        } else {
//            System.out.println("No exists id");
//        }
    }
//    private static void deleteWithConfirm(IProductService productI, int id){
//        System.out.println("Are you sure to delete this item:\n1. Yes\n2. No");
//        int choice = getChoice();
//        if(choice == 1){
//            productI.delete(id);
//            System.out.println("Deleted successfully!");
//        }
//        else {
//            main(null);
//        }
//    }
    private static void search() {
        System.out.printf("Enter name to search:");
        String name = scanner.nextLine();
        List<Authentic1> authentic1s = authenticServices1.search(name);
        List<HandGood1> handGood1s = handGoodService1.search(name);
        if(authentic1s.size() == 0 && handGood1s.size() == 0 ){
            System.out.println("No driver plate exists");
        }
        else {
            authentic1s.forEach(System.out::println);
            handGood1s.forEach(System.out::println);
        }
    }
    private static void add() {
        System.out.println("1. Authentic\n2. HandGood\n");
        int choice = getChoice();
        System.out.println("moi nhap name:");
        String namenew = scanner.nextLine();
        System.out.println("moi nhap gia:");
        int pricenew = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap hang san xuat:");
        String manufacturernew = scanner.nextLine();

        switch (choice) {

            case 1: {
                System.out.printf("warrantyTime:");
                String warrantyTimeNew = scanner.nextLine();
                for (int i = 0; i <100; i++) {
                    Authentic1 authentic1 = new Authentic1(0,namenew,pricenew,manufacturernew,warrantyTimeNew);
                    authenticServices1.create(authentic1);
                    break;
              }

                break;
            }
            case 2: {
                System.out.printf("Coutry:");
                String coutrynew = scanner.nextLine();
                System.out.printf("status");
                String statusnew = scanner.nextLine();
                for (int i = 0; i <100; i++) {
                    HandGood1 handGood1 = new HandGood1(0, namenew,pricenew,manufacturernew,coutrynew,statusnew);
                    handGoodService1.create(handGood1);
                    break;
                }
//                HandGood handGood = new HandGood(0, namenew,pricenew,manufacturernew,coutrynew,statusnew);
//                handGoodService.create(handGood);
                break;
            }
        }
    }

}
