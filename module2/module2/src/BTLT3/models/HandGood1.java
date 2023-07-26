package BTLT3.models;

public class HandGood1 extends Product1 {
   private String country;
  private   String status;

    public HandGood1(int id, String name, int price, String manufacturer, String country, String status) {
        super(id, name, price, manufacturer);
        this.country = country;
        this.status = status;
    }

    public HandGood1(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandGood{" +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}
