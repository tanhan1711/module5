package THICUOIKY;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LISTEMPLYEE {
    List<Employee> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    LISTEMPLYEE() {
        list.add(new Employee(1, "Ta Anh Nhan", "17/11/2000", "127 Nguyen Cong Phuong", "Quang Ngai", "0364524670", "nhoc2k1711@gmail.com"));
        list.add(new Employee(2, "Nguyen Quoc Hien", "14/6/2000", "28 Hoa An 25", "Da Nang", " 123456789", "asdqkjwhdkq@gmai.com"));
        list.add(new Employee(3, "nguyen ngoc hieu", "17/11/2000", "127 Nguyen Cong Phuong", "Quang Ngai", "0364524670", "nhoc2k1711@gmail.com"));
    }

    public void hienthi() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void them() {
        System.out.println("Moi nhap Id");
        int newid = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap Name");
        String newname = sc.nextLine();
        System.out.println("Moi nhap Ngay thang nam sinh");
        String newbirthday = sc.nextLine();
        System.out.println("Moi nhap dia chi");
        String newaddress = sc.nextLine();
        System.out.println("Moi nhap que quan");
        String newcountry = sc.nextLine();
        System.out.println("Moi nhap dien thoai");
        String newnumberphone = sc.nextLine();
        System.out.println("Moi nhap mail");
        String newmail = sc.nextLine();
        ;
        Employee employee = new Employee(newid, newname, newbirthday, newaddress, newcountry, newnumberphone, newmail);
        list.add(employee);
        hienthi();
    }

    public void xoa() {
        System.out.println("Moi nhap id can xoa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getIdNv()) {
                list.remove(i);
            }
        }
        hienthi();
    }

    public void timkiem() {
        System.out.println("Moi nhap id can tim kiem");
        int findId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getIdNv())==findId) {
                System.out.println(list.get(i));
            }
        }
    }
}

