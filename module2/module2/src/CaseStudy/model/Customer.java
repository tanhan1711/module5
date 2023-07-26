package CaseStudy.model;


import CaseStudy.util.ConstantUtil.TypeofPosition;
import CaseStudy.util.ConstantUtil.TypeofGuest;

public class Customer extends Person {
    private int id ;
    private TypeofGuest typeofGuest;
    private TypeofPosition typeofPosition;

    public Customer(String name, String dateOfBirth, String gender, int CMD, int numPhone, String email, int id, TypeofGuest typeofGuest, TypeofPosition typeofPosition) {
        super(name, dateOfBirth, gender, CMD, numPhone, email);
        this.id = id;
        this.typeofGuest = typeofGuest;
        this.typeofPosition = typeofPosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeofGuest getTypeofGuest() {
        return typeofGuest;
    }

    public void setTypeofGuest(TypeofGuest typeofGuest) {
        this.typeofGuest = typeofGuest;
    }

    public TypeofPosition getTypeofPosition() {
        return typeofPosition;
    }

    public void setTypeofPosition(TypeofPosition typeofPosition) {
        this.typeofPosition = typeofPosition;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", typeofGuest=" + typeofGuest +
                ", typeofPosition=" + typeofPosition +
                "} " + super.toString();
    }
}
