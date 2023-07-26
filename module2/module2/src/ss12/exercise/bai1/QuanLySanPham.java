package ss12.exercise.bai1;

import java.util.Scanner;

public class QuanLySanPham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choose;
        do {
            System.out.println("1.thêm sản phẩm\n" +
                    "2.xóa sản phẩm\n" +
                    "3.hiển thị danh sách sản phẩm\n" +
                    "4.tim kiếm sản phẩm theo tên\n" +
                    "5.sắp sếp sản phẩm tăng giảm dần theo gia\n" +
                    "6.sửa thông tin sản phẩm theo id");
            System.out.println("Moi nhap lua chon:");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    productManager.them();
                    break;
                case 2:
                    productManager.xoa();
                    break;
                case 3:
                    productManager.hienthi();
                    break;
                case 4:
                    productManager.timkiem();
                    break;
                case 5:
                    productManager.sapxep();
                    break;
                case 6:
                    productManager.sua();
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
