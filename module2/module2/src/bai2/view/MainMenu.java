package bai2.view;
import bai2.model.CanBo;
import bai2.service.CanBoService;
import bai2.util.CommonUtil;
import bai2.util.ConstantUtil;

import java.util.List;

import static bai2.util.CommonUtil.*;

public class MainMenu {
    private static CanBoService canBoService = new CanBoService();
    public static void main(String[] args) {
        while (true) {
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add\n2. Display\n3. Exit");
            int choice = getChoice(1,3);

            switch (choice) {
                case 1 :
                    add();
                    break;
                case 2 :
                    display();
                    break;
                case 3 : System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void display() {
        List<CanBo>canBos=canBoService.findAll();
        for (int i = 0; i <canBos.size() ; i++) {
            System.out.println(canBos.get(i));
        }
    }

    private static void add() {
        String newHoten = inputWithOutEmpty("Nhap ten");
        String newtypeofPosition = inputWithOutEmpty("Type of position");
        double newluong = inputToDouble("Nhap luong");
        CanBo canBo = new CanBo(newHoten,ConstantUtil.TypeofPosition1.valueOf(newtypeofPosition),newluong);
        canBoService.create(canBo);
        System.out.println("Them moi thanh cong");
    }
}

