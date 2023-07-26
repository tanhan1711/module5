package THICUOIKY;

import java.util.Date;

public class Employee {
    int IdNv;
    String Name;
    String BirthDay;
    String Address;
    String Country;
    String NumberPhone;
    String Mail;

    public Employee(int idNv, String name, String birthDay, String address, String country, String numberPhone, String mail) {
        IdNv = idNv;
        Name = name;
        BirthDay = birthDay;
        Address = address;
        Country = country;
        NumberPhone = numberPhone;
        Mail = mail;
    }

    public int getIdNv() {
        return IdNv;
    }

    public void setIdNv(int idNv) {
        IdNv = idNv;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getNumberPhone() {
        return NumberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        NumberPhone = numberPhone;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String toString() {
        return "SanPham{" +
                "Id=" + getIdNv() +
                ", name=" + getName() +
                ", birthday=" + getBirthDay() +
                ", address=" + getBirthDay() +
                ", country=" + getCountry() +
                ", number=" + getNumberPhone() +
                ", mail=" + getMail() +
                '}';
    }
}

