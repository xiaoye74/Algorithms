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
	    //��дStudent���toString()���������������ʱ�������·�ʽ���
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
//����ѧ���ɵ͵�������,����SortByNumber�࣬����ʵ��Comparator����д�ýӿڵ�compare()
class SortByNumber implements Comparator<Student1>{
  //��д�ýӿڵ�compare()ʹ�䰴��ѧ����С��������ǰ�߼�ȥ���ߣ�
  public int compare(Student1 o1, Student1 o2) {
      return o1.getNumber()-o2.getNumber();
       
  }
   
}
//���շ����ɸߵ������У�����SortByScore�࣬����ʵ��Comparator����д�ýӿڵ�compare()
class SortByScore implements Comparator<Student1>{
  //��д�ýӿڵ�compare()ʹ�䰴�շ����ɸߵ������򣨺��߼�ȥǰ�ߣ�
  @Override
  public int compare(Student1 o1, Student1 o2) {
      return o2.getScore()-o1.getScore();
       
  }
   
}


