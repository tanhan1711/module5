package ss11.exercise.bai1;

import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {
        Stack<Integer> array1 = new Stack<>();
        array1.push(1);
        array1.push(2);
        array1.push(3);
        array1.push(4);
        array1.push(5);
        array1.push(6);
        System.out.println(array1);
        int s = array1.size();
        Stack<Integer> array2 = new Stack<>();
        for (int i = 0; i <s ; i++) {
            array2.push(array1.pop());
        }
        System.out.println(array2);
    }
}
