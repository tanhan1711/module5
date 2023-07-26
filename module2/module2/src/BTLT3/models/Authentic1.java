package BTLT3.models;

public class Authentic1 extends Product1 {
   private String warrantyTime;

    public Authentic1() {
    }

    public Authentic1(int id, String name, int price, String manufacturer, String warrantyTime) {
        super(id, name, price, manufacturer);
        this.warrantyTime = warrantyTime;
    }

    public String getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return "Authentic{" +
                "warrantyTime='" + warrantyTime + '\'' +
                "} " + super.toString();
    }
}
