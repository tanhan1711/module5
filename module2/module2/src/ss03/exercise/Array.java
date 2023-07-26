package ss03.exercise;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] valueA ={10,4,6,7,8,6,0,0,0,0};
        int X = 7;
        int[] a = new int[valueA.length-1];
        int j= 0;
        for (int i = 0; i < valueA.length; i++) {
            if(i!=3){
                a[j] = valueA[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }


}
