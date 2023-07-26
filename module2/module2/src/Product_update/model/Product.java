package Product_update.model;

public abstract class Product {
    private int id;
    public String name;
    private int price;
    public String manufacturer;

//    public Product(String name, int price, String manufacturer) {
//        this.id = idtemp++;
//        this.name = name;
//        this.price = price;
//        this.manufacturer = manufacturer;
//    }
    public Product(int id,String name, int price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public Product() {
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
        return String.format("%s,%s,%s,%s", id, name, price, manufacturer);
    }
}
//    @Override
//    public String toString() {
//        return "Product1{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", manufacturer='" + manufacturer + '\'' +
//                '}';
//    }

