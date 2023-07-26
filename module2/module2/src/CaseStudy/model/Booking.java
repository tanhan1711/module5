package CaseStudy.model;

public class Booking {
    private int idBooking;
    private String startDay;
    private String endDay;
    private int idCus;
    private String nameService;
    private String TypeofService;

    public Booking(int idBooking, String startDay, String endDay, int idCus, String nameService, String typeofService) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCus = idCus;
        this.nameService = nameService;
        TypeofService = typeofService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeofService() {
        return TypeofService;
    }

    public void setTypeofService(String typeofService) {
        TypeofService = typeofService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", idCus=" + idCus +
                ", nameService='" + nameService + '\'' +
                ", TypeofService='" + TypeofService + '\'' +
                '}';
    }
}
