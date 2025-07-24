package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {

        Department department = new Department(7, "Test Department");
        System.out.println(department);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    }
}
