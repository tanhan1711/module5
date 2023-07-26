package ss11.exercise.bai1;

import java.util.Scanner;
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String> wStack= new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap chuoi:");
        String mWord = sc.nextLine();
        for (int i = 0; i <mWord.length() ; i++) {
            wStack.push(String.valueOf(mWord.charAt(i)));
        }
        for (int i = 0; i <mWord.length() ; i++) {
            System.out.print(wStack.pop());
        }

    }
}
