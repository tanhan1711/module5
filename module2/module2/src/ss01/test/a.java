package ss01.test;
import java.util.Arrays;
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        int[] valueA ={10,4,6,7,8,6,0,0,0,0};
        int X = 7;
        int index =3;
        int[] a = new int[valueA.length+1];
        int j= 0;
        for (int i = 0; i < valueA.length; i++) {
            if(index<=1 && index>=valueA.length-1) {
                System.out.println("ko chen ");
            }else {
                a[index] = X;
                a[j] = valueA[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(a));
    }


}