package THICUOIKY;

public class Fresher extends Employee {
    String Ngaytotnghiep;
    String Xeploai;
    String Truong;

    public Fresher(int idNv, String name, String birthDay, String address, String country, String numberPhone, String mail, String ngaytotnghiep, String xeploai, String truong) {
        super(idNv, name, birthDay, address, country, numberPhone, mail);
        Ngaytotnghiep = ngaytotnghiep;
        Xeploai = xeploai;
        Truong = truong;
    }

    public String getNgaytotnghiep() {
        return Ngaytotnghiep;
    }

    public void setNgaytotnghiep(String ngaytotnghiep) {
        Ngaytotnghiep = ngaytotnghiep;
    }

    public String getXeploai() {
        return Xeploai;
    }

    public void setXeploai(String xeploai) {
        Xeploai = xeploai;
    }

    public String getTruong() {
        return Truong;
    }

    public void setTruong(String truong) {
        Truong = truong;
    }
}

