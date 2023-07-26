package THICUOIKY;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LISTEMPLYEE listemplyee = new LISTEMPLYEE();
        int choose;
        do {
            System.out.println("1.thêm moi nhan vien\n" +
                    "2.xóa nhan vien\n" +
                    "3.hiển thị danh sách sản phẩm\n" +
                    "4.tim kiếm nhan vien theo tên\n"
                    );
            System.out.println("Moi nhap lua chon:");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    listemplyee.them();
                    break;
                case 2:
                    listemplyee.xoa();
                    break;
                case 3:
                    listemplyee.hienthi();
                    break;
                case 4:
                    listemplyee.timkiem();
                    break;
                default:
                    System.out.println("Vui long chon lai:");
                    break;
            }

        }
        while (choose != 0) ;{
        }
    }
}

