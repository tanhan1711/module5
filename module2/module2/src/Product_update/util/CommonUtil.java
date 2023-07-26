package Product_update.util;

import java.util.Scanner;

public class CommonUtil {

    public static   Scanner getScanner() {
        return new Scanner(System.in);
    }

    //region public methods
    public static int getChoice(int from, int to) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        while (res < from || res > to) {
            System.out.printf("Input your choice from %s to %s:", from, to);
            while (!scanner.hasNextInt()) {
                System.out.printf("Your choice have to a number. Please input again:");
                scanner.nextLine();
            }
            res = scanner.nextInt();
        }

        return res;
    }
    public static Integer inputToInteger(String field) {
        String res = inputWithOutEmpty(field);
        while (!isIntegerNumeric(res)){
            System.out.printf("This %s have to a number. Please input again\n", field);
            res = inputWithOutEmpty(field);
        }

        return Integer.parseInt(res);
    }
    public static String inputWithOutEmpty(String field){
        String res = null;

        do {
            System.out.printf(res != null ? "This %s cannot empty. Please input again:" : field + ":", field);
            res = getScanner().nextLine();
        }while (res.isBlank());

        return res;
    }
    private static boolean isIntegerNumeric(String val){
        if(val == null){
            return false;
        }

        try {
            Integer.parseInt(val);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }




}
