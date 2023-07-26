package ss01.exercise.Hello;

import java.util.Scanner ;

public class HelloClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Hello:"+name);
    }
}
