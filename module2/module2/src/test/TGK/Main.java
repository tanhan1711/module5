package test.TGK;

import java.util.Scanner;

public class Main {

    static DanhSachBenhNhan listBN;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;

        do {
            showMenu();

            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhap so nhan vien");
                    n = Integer.parseInt(scan.nextLine());
                    listBN = new DanhSachBenhNhan(n);
                    listBN.inputFile();
                    break;
                case 2:
                    listBN.display();
                    break;
                case 3:
                    BenhNhan benhNhan = null;
                    System.out.println("Ma benh nhan");
                    String maBN = scan.nextLine();

                    System.out.println("Ho ten benh nhan");
                    String hoTen = scan.nextLine();

                    System.out.println("Ngay nhap vien (dd/MM/yyyy)");
                    String ngayNhapVien = scan.nextLine();

                    System.out.println("Ngay ra vien (dd/MM/yyyy)");
                    String ngayRaVien = scan.nextLine();

                    System.out.println("Phong theo yeu cau");
//                    boolean phong = scan.nextBoolean();
                    boolean phong = Boolean.parseBoolean(scan.nextLine());
                    System.out.println("Benh nhan BHYT (Y)\nBenh nhan BHXH (X)");
                    String key = scan.nextLine();
                    if (key.equalsIgnoreCase("Y")) {
                        System.out.println("Nhap ma BHYT");
                        String maBHYT = scan.nextLine();
                        benhNhan = new BenhNhanBaoHiemYTe(maBHYT, maBN, hoTen, ngayNhapVien, ngayRaVien, phong);
                    } else if (key.equalsIgnoreCase("X")) {
                        System.out.println("Nhap ma BHXH");
                        String maBHXH = scan.nextLine();
                        benhNhan = new BenhNhanBaoHiemXaHoi(maBN, hoTen, ngayNhapVien, ngayRaVien, phong, maBHXH);
                    }

                    listBN.insert(benhNhan);
                    listBN.display();
                case 4:
                    System.out.println("Nhap ma benh nhan muon xoa");
                    String maBNRemove = scan.nextLine();
                    listBN.remove(maBNRemove);
                    break;
                case 5:
                    System.out.println("Nhap ma benh nhan muon tim");
                    String maBNSearch = scan.nextLine();
                    System.out.println(listBN.searchByMaBN(maBNSearch));
                    break;
                case 6:
                    System.out.println("Tong tien vien phi benh nhan BHYT: " + listBN.sumBHYT());
                    break;
                case 7:
                    System.out.println("Tong tien vien phi benh nhan BHXH: " + listBN.sumBHXH());
                    break;
                case 8:
                    System.out.println("Doc file DanhSachNhanVien.txt");
                    listBN.loadFile();
                    listBN.display();
                    break;
                default:
                    System.out.println("Vui long chon 1-8");
                    break;
            }
        } while (choose != 0);
    }

    static void showMenu() {
        System.out.println("1. Nhap thong tin benh nhan");
        System.out.println("2. In ra thong tin benh nhan");
        System.out.println("3. Them moi benh nhan");
        System.out.println("4. Xoa benh nhan theo ma benh nhan");
        System.out.println("5. Tim kiem benh nhan theo ma benh nhan");
        System.out.println("6. Tong tien vien phi benh nhan BHYT");
        System.out.println("7. Tong tien vien phi benh nhan BHXH");
        System.out.println("8. Doc file DanhSachBenhNhan.txt");
        System.out.println("0. Thoat!");
        System.out.println("Chon");
    }
}

