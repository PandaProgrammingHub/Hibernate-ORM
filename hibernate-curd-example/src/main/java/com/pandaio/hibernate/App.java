package com.pandaio.hibernate;

import java.util.List;

import com.pandaio.hibernate.dao.StudentDao;
import com.pandaio.hibernate.entity.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDao studentDao = new StudentDao();

		// test saveStudent
		Student student = new Student("Santosh", "Panda", "santoshpanda299@gmail.com");
		studentDao.saveStudent(student);

		// test updateStudent
		student.setFirstName("Saroj");
		studentDao.updateStudent(student);

		// test getStudentById
		Student student2 = studentDao.getStudentById(student.getId());
		System.out.println("============== Student Details By Student Id : " + student2.getId() + "==============");
		System.out.println("Name :" + student2.getFirstName() + " " + student2.getLastName());
		System.out.println("Email :" + student2.getEmail());

		// test getAllStudent
		List<Student> students = studentDao.getAllStudent();
		students.forEach(s -> {
			System.out.println("==============All Student Details : " + s + "==============");
			System.out.println("Name :" + s.getFirstName() + " " + s.getLastName());
			System.out.println("Email :" + s.getEmail());
		});

		// test deleteStudent
		studentDao.deleteStudent(student.getId());

	}

}
