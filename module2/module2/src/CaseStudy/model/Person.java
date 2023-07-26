package CaseStudy.model;

public abstract class Person {
//    Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email
    private String name;
    private String dateOfBirth;
    private String gender ;
    private int CMD ;
    private int numPhone ;
    private String Email;

    public Person(String name, String dateOfBirth, String gender, int CMD, int numPhone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender=gender;
        this.CMD = CMD;
        this.numPhone = numPhone;
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCMD() {
        return CMD;
    }

    public void setCMD(int CMD) {
        this.CMD = CMD;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", CMD=" + CMD +
                ", numPhone=" + numPhone +
                ", Email='" + Email + '\'' +
                '}';
    }
}
