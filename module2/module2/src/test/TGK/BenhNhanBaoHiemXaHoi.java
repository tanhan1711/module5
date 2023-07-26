package test.TGK;
import java.util.Scanner;

public class BenhNhanBaoHiemXaHoi extends BenhNhan implements IVienPhi {
    private String maBHXH;

    public BenhNhanBaoHiemXaHoi() {
    }

    public BenhNhanBaoHiemXaHoi(String maBN, String hoTen, String ngayNhapVien, String ngayRaVien, boolean phong, String maBHXH) {
        super(maBN, hoTen, ngayNhapVien, ngayRaVien, phong);
        this.maBHXH = maBHXH;
    }

    public String getMaBHXH() {
        return maBHXH;
    }

    public void setMaBHXH(String maBHXH) {
        this.maBHXH = maBHXH;
    }

    @Override
    public String input() {
        Scanner scan = new Scanner(System.in);
        String info = "";
        info += super.input();
        System.out.println("Nhap ma BHXH");
        maBHXH = scan.nextLine();
        info += ", " + maBHXH;
        return info;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma BHXH: " + maBHXH);
    }

    @Override
    public double tinhGiaDonPhong() {
        return super.tinhSoNgayNhapVien() * 150000;
    }

    @Override
    public double tinhHoaDonVienPhi() {
        if(super.getPhong()) {
            return (super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong() * 200000);
        }
        return super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong();
    }


}
