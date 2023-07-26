package test.TGK;

import java.util.Scanner;

public class BenhNhan {
    private String maBN, hoTen, ngayNhapVien, ngayRaVien;
    private boolean  phong;
    public BenhNhan() {
    }

    public BenhNhan(String maBN, String hoTen, String ngayNhapVien, String ngayRaVien, boolean phong) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.phong = phong;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public boolean getPhong() {
        return phong;
    }

    public void setPhong(boolean phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return "BenhNhan{" + "maBN=" + maBN + ", hoTen=" + hoTen + ", ngayNhapVien=" + ngayNhapVien + ", ngayRaVien=" + ngayRaVien + ", phong=" + phong + '}';
    }

    public int tinhSoNgayNhapVien() {
        String[] params = ngayNhapVien.split("/");
        int y1 = Integer.parseInt(params[0]);

        String[] params2 = ngayRaVien.split("/");
        int y2 = Integer.parseInt(params2[0]);

        return y2-y1;
    }

    public String input() {
        String info = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Ma benh nhan");
        maBN = scan.nextLine();

        System.out.println("Ho ten benh nhan");
        hoTen = scan.nextLine();

        System.out.println("Ngay nhap vien (dd/MM/yyyy)");
        ngayNhapVien = scan.nextLine();

        System.out.println("Ngay ra vien (dd/MM/yyyy)");
        ngayRaVien = scan.nextLine();

        System.out.println("Phong theo yeu cau");
        phong = scan.nextBoolean();

        info = maBN + ", " + hoTen + ", " + ngayNhapVien + ", " + ngayRaVien + ", " + phong;
        return info;
    }

    public void display() {
        System.out.println("Ma benh nhan: " + maBN);
        System.out.println("Ho va ten benh nhan: " + hoTen);
        System.out.println("Ngay nhap vien: " + ngayNhapVien);
        System.out.println("Ngay ra vien: " + ngayRaVien);
        System.out.println("Phong theo yeu cau: " + phong);
    }
}
