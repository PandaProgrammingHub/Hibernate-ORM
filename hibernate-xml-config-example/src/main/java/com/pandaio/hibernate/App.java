package com.pandaio.hibernate;

import java.util.List;

import com.pandaio.hibernate.dao.StudentDao;
import com.pandaio.hibernate.entity.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDao studentDao = new StudentDao();
		Student student = new Student("Santosh12", "Panda12", "santoshpanda29912@gmail.com");
		Student student1 = new Student("Saroj12", "Panda12", "sarojpanda29912@gmail.com");
		Student student2 = new Student("Daisy12", "Panda12", "daisyhpanda29912@gmail.com");
		studentDao.saveStudent(student);
		studentDao.saveStudent(student1);
		studentDao.saveStudent(student2);

		List<Student> students = studentDao.getStudents();
		students.forEach(s -> {
			System.out.println("==============All Student Details : " + s + "==============");
			System.out.println("Name :" + s.getFirstName() + " " + s.getLastName());
			System.out.println("Email :" + s.getEmail());
		});
		int id = 2;
		Student stud = studentDao.getStudent(id);
		System.out.println("==============One Student Details : " + stud + "==============");
		System.out.println("Name :" + stud.getFirstName() + " " + stud.getLastName());
		System.out.println("Email :" + stud.getEmail());
	}

}
