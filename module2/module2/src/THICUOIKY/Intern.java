package THICUOIKY;

public class Intern extends Employee{
    String Specialized ;
    String Semester;
    String SchoolName;
    String ExpectedDay;

    public Intern(int idNv, String name, String birthDay, String address, String country, String numberPhone, String mail, String specialized, String semester, String schoolName, String expectedDay) {
        super(idNv, name, birthDay, address, country, numberPhone, mail);
        Specialized = specialized;
        Semester = semester;
        SchoolName = schoolName;
        ExpectedDay = expectedDay;
    }

    public String getSpecialized() {
        return Specialized;
    }

    public void setSpecialized(String specialized) {
        Specialized = specialized;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getExpectedDay() {
        return ExpectedDay;
    }

    public void setExpectedDay(String expectedDay) {
        ExpectedDay = expectedDay;
    }
}
