package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

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

    }
}
