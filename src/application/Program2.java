package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ===== TEST 1: Department findById ===== ");
		
		Department department = departmentDao.findById(2);
		
		System.out.println(department);
		
		System.out.println(" \n ===== TEST 2: Department findAll ===== ");
		List<Department> list = departmentDao.findAll();
		for (Department o: list) {
			System.out.println(o);
		}
		System.out.println(" \n ===== TEST 4: Department Insert ===== ");
		Department newDep = new Department(null,"Peças");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		sc.close();

	}

}
