package com.task;

public class Pojo_B {
public static void main(String[] args) {
 Pojo_A s = new Pojo_A();
	 
	 int age = s.getAge();
	 System.out.println(age);
	 
	 s.setAge(35);
		
	 int age1 = s.getAge();
	 System.out.println(age1);
	 
	 s.setAge(55);	
	 
	 int age2 = s.getAge();
	 System.out.println(age2);
	 
}
}
