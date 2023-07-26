package CaseStudy.service;

import CaseStudy.model.Customer;
import CaseStudy.model.Employee;
import CaseStudy.util.ConstantUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {

    Scanner sc = new Scanner(System.in);
    LinkedList<Customer> customers = new LinkedList<>();
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public void create() {

        System.out.println("nhap ten  :");
        String newname = sc.nextLine();
        System.out.println("ngay sinh   :");
        String newdateofBirth = sc.nextLine();
        System.out.println("gioi tinh :");
        String newgender = sc.nextLine();
        System.out.println("cmt   :");
        int newcmd = Integer.parseInt(sc.nextLine());
        System.out.println("numphone  :");
        int newnumphone = Integer.parseInt(sc.nextLine());
        System.out.println("email :");
        System.out.println("nhap id");
        int newId = Integer.parseInt(sc.nextLine());
        String newemail = sc.nextLine();
        System.out.println("guest  :");
        String newguest = sc.nextLine();
        System.out.println("position  :");
        String newposition = sc.nextLine();
        Customer customer = new Customer(newname,newdateofBirth,newgender,newcmd,newnumphone,newemail,newId, ConstantUtil.TypeofGuest.valueOf(newguest),ConstantUtil.TypeofPosition.valueOf(newposition));
        customers.add(customer);
    }

    @Override
    public void delete(int Id) {

    }

    @Override
    public List<Customer> search(String name) {
        return null;
    }

    @Override
    public void display() {
        for (int i = 0; i <customers.size() ; i++) {
            System.out.println(customers.get(i));
        }

    }

    public void edit(){
        System.out.println("tên sửa thành :");
        String editname = sc.nextLine();
        System.out.println("ngay sinh sửa thành :");
        String editdateofBirth = sc.nextLine();
        System.out.println("gioi tinh sửa thành :");
        String editgender = sc.nextLine();
        System.out.println("cmt sửa thành :");
        int editcmd = Integer.parseInt(sc.nextLine());
        System.out.println("numphone sửa thành :");
        int editnumphone = Integer.parseInt(sc.nextLine());
        System.out.println("email sửa thành :");
        String editemail = sc.nextLine();
        System.out.println("Mời nhập id sản phẩm cần sửa");
        int editId = Integer.parseInt(sc.nextLine());
        System.out.println("guest sửa thành :");
        String editguest = sc.nextLine();
        System.out.println("position sửa thành :");
        String editposition = sc.nextLine();

        Customer customer = new Customer(editname,editdateofBirth,editgender,editcmd,editnumphone,editemail,editId, ConstantUtil.TypeofGuest.valueOf(editguest),ConstantUtil.TypeofPosition.valueOf(editposition));
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == editId) {
                customers.set(i, customer);
                break;
            }
        }
    }
}
