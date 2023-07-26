package ss14.exercise;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int x ,pos;
        for (int i = 0; i < arr.length ; i++) {
             x=arr[i];
             pos =i;
            int flag = arr[i];
             while (0<pos && flag <arr[pos-1]){
                 arr[pos]=arr[pos-1];
                 pos--;
             }
             arr[pos] = flag;
            System.out.println("lan thu "+i+":"+ Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] numbers = {16, 13,50, 43, 58, 2};
        insertionSort(numbers);
    }
}
