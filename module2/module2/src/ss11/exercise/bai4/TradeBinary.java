package ss11.exercise.bai4;

import java.util.Stack;

public class TradeBinary {
    public static void main(String[] args) {
        Stack<Integer> Binary = new Stack<>();
        int num = 16;
        int temp ;
        System.out.println("after:");
        System.out.println("before:");
        while (num!=0){
            temp=num%2;
            Binary.push(temp);
            num=num/2;
            
        }
        while (!Binary.isEmpty()){
            System.out.println(Binary.pop());
        }
    }
}
