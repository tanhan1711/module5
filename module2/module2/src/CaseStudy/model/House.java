package CaseStudy.model;

import CaseStudy.util.ConstantUtil;

public class House extends Facility{
    private String standardRoom;
    private int areaPool;

    public House(String nameService, int area, int fee, int maxPeople, ConstantUtil.TypeofRent typeofRent, String standardRoom, int areaPool) {
        super(nameService, area, fee, maxPeople, typeofRent);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                "} " + super.toString();
    }
}
