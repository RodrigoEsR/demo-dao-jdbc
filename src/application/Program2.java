package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===Department finById===");
        Department department = departmentDao.finById(2);

        System.out.println(department);

        System.out.println("===Department Insert===");
        Department newDepartment = new Department(null, "TestDepartment");
        departmentDao.insert(newDepartment);
        System.out.println("Insert completed! ID: " + newDepartment.getId());

        System.out.println("===Department findAll===");
        List<Department> dep = departmentDao.findAll();
        for (Department obj : dep) {
            System.out.println(obj);
        }

        System.out.println("===Department update===");
        department = departmentDao.finById(3);
        department.setName("Antiquary");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("===Department deleteById===");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed!");
    }
}
