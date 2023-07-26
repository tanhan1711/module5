package CaseStudy.service;

import CaseStudy.util.ConstantUtil;
import CaseStudy.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void create() {
        System.out.println("nhap id");
        int newId = Integer.parseInt(sc.nextLine());
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
        String newemail = sc.nextLine();
        System.out.println("level  :");
        String newlevel = sc.nextLine();
        System.out.println("position  :");
        String newposition = sc.nextLine();
        System.out.println("wage  :");
        int newwage = Integer.parseInt(sc.nextLine());
        Employee employee1 = new Employee(newId,newname,newdateofBirth,newgender,newcmd,newnumphone,newemail,ConstantUtil.TypeofLevel.valueOf(newlevel),ConstantUtil.TypeofPosition.valueOf(newposition),newwage);
        employees.add(employee1);
    }

    @Override
    public void delete(int Id) {

    }

    @Override
    public List<Employee> search(String name) {
        return null;
    }

    @Override
    public void display() {
        for (int i = 0; i <employees.size() ; i++) {
            System.out.println(employees.get(i));
        }

    }

    public void edit(){System.out.println("Mời nhập id sản phẩm cần sửa");
        int editId = Integer.parseInt(sc.nextLine());
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
        System.out.println("level sửa thành :");
         String editlevel = sc.nextLine();
        System.out.println("position sửa thành :");
        String editposition = sc.nextLine();
        System.out.println("wage sửa thành :");
        int editwage = Integer.parseInt(sc.nextLine());

        Employee employee = new Employee(editId, editname, editdateofBirth,editgender,editcmd,editnumphone,editemail, ConstantUtil.TypeofLevel.valueOf(editlevel),ConstantUtil.TypeofPosition.valueOf(editposition),editwage);
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == editId) {
                employees.set(i, employee);
                break;
            }
        }
            }
        }
