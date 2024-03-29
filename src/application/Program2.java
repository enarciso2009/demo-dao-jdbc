package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = (DepartmentDao) DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 3: seller insert   ======");
		Department newDepartment = new Department(5, "FOOD");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted New id = " + newDepartment);
	}

}
