package lianxi;

public class Student implements Comparable<Student>{
		 private String name;
		 private int age;
		 public Student(){
			 this.name="unknown";
			 this.age=0;
		 }
		 public Student(String a, int b){
			 this.name=a;
			 this.age=b;
		 }
		 public int compareTo(Student o){
			 return age-o.age;
		 }
		 public String toString(){
			 return "name:"+name+",age:"+age;
		 }
	 }


