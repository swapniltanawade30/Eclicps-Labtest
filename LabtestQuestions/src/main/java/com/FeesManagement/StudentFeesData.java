package com.FeesManagement;

import java.util.HashMap;
/*
 * program FMS
 * code by:krushikesh
 * date:26-10-2022
 */
//importing packages
import java.util.Scanner;

//declaring class
public class StudentFeesData {

	// calling main method
	public static void main(String[] args) {
		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating Student fees data object
		Student sdata = new Student();
		// TODO Auto-generated method stub
		HashMap<String, Student> sfees = new HashMap<String, Student>();

		// adding students
		sfees.put("Swapnil", new Student(21, "swapnil", 16000));
		sfees.put("Pooja", new Student(41, "pooja", 18000));
		sfees.put("Raj", new Student(21, "Raj", 6000));
		sfees.put("Joy", new Student(21, "j0y", 23000));
		sfees.put("Poonam", new Student(21, "poonam", 12000));

		System.out.println("Fees Portal :");
		System.out.println("=============================");
		System.out.println("Enter Student Name :");
		String student = sc.nextLine();

		// check :Student is present in the map
		boolean status = sfees.containsKey(student);

		// displaying the information
		if (status) {
			System.out.println("============Student Fees Information=================");
			sdata = sfees.get(student);
			System.out.println(sdata);

		} else {
			System.out.println("=============Student Not Found================");
		}

		sc.close();

	}
}
