package test.TGK;
import java.util.Scanner;

public class BenhNhanBaoHiemYTe extends BenhNhan implements IVienPhi {

    private String maBHYT;

    public BenhNhanBaoHiemYTe() {
    }

    public BenhNhanBaoHiemYTe(String maBHYT, String maBN, String hoTen, String ngayNhapVien, String ngayRaVien, boolean phong) {
        super(maBN, hoTen, ngayNhapVien, ngayRaVien, phong);
        this.maBHYT = maBHYT;
    }

    public String getMaBHYT() {
        return maBHYT;
    }

    public void setMaBHYT(String maBHYT) {
        this.maBHYT = maBHYT;
    }

    @Override
    public String input() {
        Scanner scan = new Scanner(System.in);
        String info = "";
        info += super.input();
        System.out.println("Nhap ma BHYT");
        maBHYT = scan.nextLine();
        info += ", " + maBHYT;
        return info;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Ma bao hiem y te: " + maBHYT);
    }

    @Override
    public double tinhGiaDonPhong() {
        return super.tinhSoNgayNhapVien() * 150000;
    }

    @Override
    public double tinhHoaDonVienPhi() {
        if (super.getPhong()) {
            return (double)(super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong() * 200000) - 0.7 * (super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong());
        }
        return (super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong() - 0.7 * (super.tinhSoNgayNhapVien() * this.tinhGiaDonPhong()));
    }

}
