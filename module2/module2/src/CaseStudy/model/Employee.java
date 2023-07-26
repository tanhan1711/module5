package CaseStudy.model;

import CaseStudy.util.ConstantUtil.TypeofPosition;
import CaseStudy.util.ConstantUtil.TypeofLevel;

public class Employee extends Person{
    private int id;
    private TypeofLevel typeofLevel;
    private TypeofPosition typeofPosition;
    private int wage;

    public Employee(int id,String name, String dateOfBirth, String gender, int CMD, int numPhone, String email, TypeofLevel typeofLevel, TypeofPosition typeofPosition, int wage) {
        super(name, dateOfBirth, gender, CMD, numPhone, email);
        this.id = id;
        this.typeofLevel = typeofLevel;
        this.typeofPosition = typeofPosition;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeofLevel getTypeofLevel() {
        return typeofLevel;
    }

    public void setTypeofLevel(TypeofLevel typeofLevel) {
        this.typeofLevel = typeofLevel;
    }

    public TypeofPosition getTypeofPosition() {
        return typeofPosition;
    }

    public void setTypeofPosition(TypeofPosition typeofPosition) {
        this.typeofPosition = typeofPosition;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", typeofLevel=" + typeofLevel +
                ", typeofPosition=" + typeofPosition +
                ", wage=" + wage +
                "} " + super.toString();
    }
}
