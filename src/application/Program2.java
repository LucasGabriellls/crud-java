package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");
        Department newDepartment = new Department(null, "Pedreiro");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 2: department findByID ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== TEST 3: department update ===");
        department = departmentDao.findById(2);
        department.setName("dev");
        departmentDao.update(department);
        System.out.println(department);
        System.out.println("Updated completed");

        System.out.println("\n=== TEST 4: department delete ===");
        //departmentDao.deleteById(9);
        System.out.println("Deleted Completed");

        System.out.println("\n=== TEST 5: department findAll ===");
        List<Department> departments = departmentDao.findAll();

        for (Department department1 : departments) {
            System.out.println(department1);
        }
    }
}
