package ss19.bai1;

public class CheckRegexClass {
    public static void main(String[] args) {
        String regexClass = "^[ACP]\\d{4}[IGHKLM]$";
        String className = "C0318E5";
        System.out.println(className.matches(regexClass) ? "Valid" : "Invalid");


//        System.out.println(className.matches(regexClass));
//        if (className.matches(regexClass)){
//            System.out.println("Hop le");
//        }else {
//            System.out.println("ko hop le");
//        }
        }
}
