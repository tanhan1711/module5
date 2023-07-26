package CaseStudy.model;

import CaseStudy.util.ConstantUtil;

public class Villa extends Facility{
    private String standardRoom;
    private int areaPool;
    private int numFloor;

    public Villa(String nameService, int area, int fee, int maxPeople, ConstantUtil.TypeofRent typeofRent, String standardRoom, int areaPool, int numFloor) {
        super(nameService, area, fee, maxPeople, typeofRent);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numFloor = numFloor;
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

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", numFloor=" + numFloor +
                "} " + super.toString();
    }
}
