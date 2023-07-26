package Product_update.model;

public class Authentic extends Product {
    private static int idAu=0;
    private int warranty;
private int athId;
    public Authentic(int id, String name, int price, String manufacturer, int warranty) {
        super(idAu++, name, price, manufacturer);
        this.warranty = warranty;
    }

    public Authentic(int warranty) {
        this.warranty = warranty;
    }

    public Authentic() {
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), warranty);
    }
}
