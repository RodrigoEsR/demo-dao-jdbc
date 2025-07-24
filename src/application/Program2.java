package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===Test finById===");
        Department department = departmentDao.finById(2);

        System.out.println(department);

        System.out.println("===Test Insert===");
        Department newDepartment = new Department(null, "TestDepartment");
        departmentDao.insert(newDepartment);
        System.out.println("Insert completed! ID: " + newDepartment.getId());
        

    }
}
