package CaseStudy.model;

import CaseStudy.util.ConstantUtil;
import CaseStudy.util.ConstantUtil.TypeofRent;
public abstract class Facility {
    private String nameService ;
    private int area;
    private int fee;
    private int maxPeople;
    private TypeofRent typeofRent;

    public Facility(String nameService, int area, int fee, int maxPeople, TypeofRent typeofRent) {
        this.nameService = nameService;
        this.area = area;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.typeofRent = typeofRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public TypeofRent getTypeofRent() {
        return typeofRent;
    }

    public void setTypeofRent(TypeofRent typeofRent) {
        this.typeofRent = typeofRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", fee=" + fee +
                ", maxPeople=" + maxPeople +
                ", typeofRent=" + typeofRent +
                '}';
    }
}
