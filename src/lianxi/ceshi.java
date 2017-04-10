package lianxi;

import java.util.Arrays;

public class ceshi {
	public static void main(String[] args){
		 Student1[] persons = new Student1[5];
	        persons[0] =new Student1("tom",1,88,45);
	        persons[1] =new Student1("jack",6,80,12);
	        persons[2] =new Student1("bill",4,68,21);
	        persons[3] =new Student1("kandy",2,98,34);
	        persons[4] =new Student1("lily",5,94,20);
	        System.out.println("排序前的数据：");
	        for (Student1 student:persons) {
	            System.out.println(student);
	        }
	        //创建SortByNumber对象，将其作为参数传入Arrays.sort(persons,sortByNumber)方法中
	        SortByNumber sortByNumber = new SortByNumber();
	        Arrays.sort(persons,sortByNumber);
	        System.out.println("根据学生编号由低到高排序：");
	        for (Student1 student:persons) {
	            System.out.println(student);
	        }
	        SortByScore sortByScore = new SortByScore();
	        Arrays.sort(persons,sortByScore);
	        System.out.println("根据学生成绩由高到低排序：");
	        for (Student1 student:persons) {
	            System.out.println(student);
	        }
	 

}}
