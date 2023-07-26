package CaseStudy.model;

import CaseStudy.util.ConstantUtil;

public class Room extends Facility{
    private String freeService;

    public Room(String nameService, int area, int fee, int maxPeople, ConstantUtil.TypeofRent typeofRent, String freeService) {
        super(nameService, area, fee, maxPeople, typeofRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
