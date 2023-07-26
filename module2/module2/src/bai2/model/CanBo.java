package bai2.model;

import bai2.util.ConstantUtil;

public class CanBo {
    private String hoTen;
    private ConstantUtil.TypeofPosition1 typeofPosition;
    private double luong;

    public CanBo(String hoTen, double luong) {
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public CanBo() {
    }

    public CanBo(String hoTen, ConstantUtil.TypeofPosition1 typeofPosition, double luong) {
        this.hoTen = hoTen;
        this.typeofPosition = typeofPosition;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public ConstantUtil.TypeofPosition1 getTypeofPosition() {
        return typeofPosition;
    }

    public void setTypeofPosition(ConstantUtil.TypeofPosition1 typeofPosition) {
        this.typeofPosition = typeofPosition;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", typeofPosition=" + typeofPosition +
                ", luong=" + luong +
                '}';
    }
}
