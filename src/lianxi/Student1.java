package lianxi;

import java.util.Comparator;

public class Student1 {
	    private String name;
	    private int number;
	    private int score;
	    private int age;
	     
	    public Student1(String name,int number,int score,int age){
	        this.name = name;
	        this.number = number;
	        this.score = score;
	        this.age = age;
	    }
	    //重写Student类的toString()方法，在输入对象时按照以下方式输出
	    @Override
	    public String toString() {      
	        return "Student[name:"+name+",age:"+age+",number:"+number+",score:"+score+"]";
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getNumber() {
	        return number;
	    }
	 
	    public void setNumber(int number) {
	        this.number = number;
	    }
	 
	    public int getScore() {
	        return score;
	    }
	 
	    public void setScore(int score) {
	        this.score = score;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	     
	     
	     
	}
//按照学号由低到高排列,创建SortByNumber类，该类实现Comparator，重写该接口的compare()
class SortByNumber implements Comparator<Student1>{
  //重写该接口的compare()使其按照学号由小到大排序（前者减去后者）
  public int compare(Student1 o1, Student1 o2) {
      return o1.getNumber()-o2.getNumber();
       
  }
   
}
//按照分数由高到低排列，创建SortByScore类，该类实现Comparator，重写该接口的compare()
class SortByScore implements Comparator<Student1>{
  //重写该接口的compare()使其按照分数由高到低排序（后者减去前者）
  @Override
  public int compare(Student1 o1, Student1 o2) {
      return o2.getScore()-o1.getScore();
       
  }
   
}


