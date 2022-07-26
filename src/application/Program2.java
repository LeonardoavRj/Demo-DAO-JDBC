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
		System.out.println(" \n ===== TEST 3: Department Insert ===== ");
		Department newDep = new Department(null,"Peças");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println(" \n ===== TEST 4: Department Update ===== ");
		department = departmentDao.findById(6);
		department.setName("Bebida");
		departmentDao.update(department);
		System.out.println("UpDate Completed ");
		
		System.out.println(" \n ===== TEST 5: Department delete ===== ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed");
		sc.close();

	}

}
