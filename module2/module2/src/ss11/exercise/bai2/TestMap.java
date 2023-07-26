package ss11.exercise.bai2;

import java.util.*;

import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi ");
        String s1 = scanner.nextLine();
        String[] tmp = s1.split("");

        for (int i = 0; i < tmp.length; i++) {
            int count = 1;

            if (result.containsKey(tmp[i])) {
                result.put(tmp[i], result.get(tmp[i]) + 1);
            } else {
                result.put(tmp[i], count);
            }

        }


        for (Map.Entry<String, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
