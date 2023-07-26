package ss03.exercise;

import java.util.Arrays;

public class GopArray {
//    public static void main(String[] args) {
//        int[] valueA ={1,2,3};
//        int[] valueB ={4,5,6};
//        int[] valueC = new int[valueA.length+valueB.length];
//        System.arraycopy(valueA, 0, valueC, 0, valueA.length);
//        System.arraycopy(valueB, 0, valueC, valueA.length, valueB.length);
//        System.out.println(Arrays.toString(valueC));
//    }
public static void main(String[] args) {
        int[] A ={1,2,3};
        int[] B ={4,5,6};
    int[] C = new int[A.length+B.length];
    for (int i = 0; i <A.length ; i++) {
        C[i]= A[i];
    }
    for (int i = 0; i <B.length ; i++) {
        C[i+B.length ] = B[i];
    }
    System.out.println(Arrays.toString(C));
}
}
