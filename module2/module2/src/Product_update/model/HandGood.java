package Product_update.model;

public class HandGood extends Product {
    private static int idProduct = 0;
    private String country;
    private String status;

    public HandGood(int id, String name, int price, String manufacturer, String country, String status) {
        super(idProduct++, name, price, manufacturer);
        this.country = country;
        this.status = status;
    }

    public HandGood(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public HandGood() {
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
        return String.format("%s,%s,%s", super.toString(), country, status);
    }
}
