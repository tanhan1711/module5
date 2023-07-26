package test;

public class MyClass {
    void method(int[] x) {
        x[0] = 5;
        x[1] = 5;
    }

    public static void main(String[] args) {
        MyClass o = new MyClass();
        int[] x = {1, 1};
        o.method(x);
        System.out.printf("x=%d, y=%d", x[0], x[1]);
    }
}
//interface BirthdayRegex {
//    String birthday_format = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$";
//}
//interface NameRegex{
//    String name_format = "^(([A-Z]{1}[a-z]+)( )?){1,}$";
//}
//String regexClass ="^\\d{2}\\-\\d{9}$";