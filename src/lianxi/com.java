package lianxi;

import java.util.Arrays;

public class com {
	public static void main(String[] args){
		Student[] students=new Student[5];
		students[0]=new Student("tom",5);
		students[1]=new Student("toy",6);
		students[2]=new Student("gay",7);
		students[3]=new Student();
		students[4]=new Student();
		Arrays.sort(students);
		for(Student student:students){
			System.out.println(student);
		}
	}
	

}
 
