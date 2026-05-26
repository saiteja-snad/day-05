package day4and5;
import java.util.*;
class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	 Employee(int id,String name,int salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
//	public int compareTo(Employee e) {
//		return this.name.compareTo(e.name);
	 
//	 public int compareTo(Employee e) {
//		 return this.id-e.id;
	 
	 public int compareTo(Employee e) {
		 return this.salary-e.salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
}
public class Comparable1 {
	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<>();
		Employee e1=new Employee(1,"sai",450000);
		Employee e2=new Employee(2,"anu",470000);
		Employee e3=new Employee(3,"prasad",480000);
		Employee e4=new Employee(4,"teja",400000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Collections.sort(list);
		System.out.println(list);
	}
   
}
