package ss12.exercise.bai1;

import java.util.*;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    ProductManager() {
        products.add(new Product(1, "nhan", 1220));
        products.add(new Product(2, "hieu", 12120));
        products.add(new Product(3, "ha", 313));
    }

    public void hienthi() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public void them() {
        System.out.println("Moi nhap Id");
        int newid = Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap Name");
        String newname = sc.nextLine();
        System.out.println("Moi nhap Price");
        int newprice = Integer.parseInt(sc.nextLine());
        Product product = new Product(newid, newname, newprice);
        products.add(product);
        hienthi();
    }

    public void xoa() {
        System.out.println("Moi nhap id can xoa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(i);
            }
        }
        hienthi();
    }

    public void sua() {
        System.out.println("Mời nhập id sản phẩm cần sửa");
        int editId = Integer.parseInt(sc.nextLine());
        System.out.println("tên sửa thành :");
        String editname = sc.nextLine();
        System.out.println("giá sửa thành :");
        int editprice = Integer.parseInt(sc.nextLine());
        Product product = new Product(editId, editname, editprice);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == editId) {
                products.set(i, product);
                break;
            }
        }
        hienthi();
    }

    public void timkiem() {
        System.out.println("Moi nhap Name can tim kiem");
        String findName = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (findName.equals(products.get(i).getName())) {
                System.out.println(products.get(i));
            }
            }
        }
        public void sapxep () {
            Collections.sort(products, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice()<o2.getPrice()){
                        return -1;
                    }else if (o1.getPrice()> o2.getPrice()){
                        return 1;
                    }else {
                        return 0;
                    }
                }
            });
            hienthi();
        }

    }
