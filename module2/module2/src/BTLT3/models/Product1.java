package BTLT3.models;

public abstract class Product1 {
    private static int idtemp = 0;
   private int id ;
   public String name ;
  private   int price ;
  public   String manufacturer;

    public Product1(int id, String name, int price, String manufacturer) {
        this.id = idtemp++;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Product1(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Product1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
