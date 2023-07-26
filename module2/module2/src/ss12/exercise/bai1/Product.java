package ss12.exercise.bai1;

public class Product {
    int Id;
    String Name;
    int Price;

    public Product(int id, String name, int price) {
        Id = id;
        Name = name;
        Price = price;
    }

    public Product() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String toString() {
        return "SanPham{" +
                "Id=" + getId() +
                ", name=" + getName() +
                ", price=" + getPrice() +
                '}';
    }
//    public int compareTo(Product product){
//         return this.getPrice();
//    }
}
