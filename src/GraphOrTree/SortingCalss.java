package GraphOrTree;
import java.util.*;
public class SortingCalss {
	 public static void main(String[] args) {
		 Student s1=new Student(2, "Suman", 23);
		 Student s2=new Student(5, "nandan", 20);
		 Student s3=new Student(5, "Bikash", 18);
		 
		 ArrayList<Student> list=new ArrayList<Student>();
		 
		 list.add(s1);
		 list.add(s2);
		 list.add(s3);
		 
		 
		 //lamda expression and Java 8 sort api
		 
		 list.sort((Student s5,Student s4)-> {
			 return s5.age-s4.age;
		 });
		 
		 
		 //instance method reference 
		 Collections.sort(list,Comparator.comparing(Student::getId));
		 
		 
		 
		 //sort with multiple attributes
		 
		 list.sort(Comparator.comparing(Student::getId).thenComparing(Student::getAge));
		 
		 
		 list.forEach(st->{
			 System.out.println(st.name);
		 });
		 
		
		 
	}
	

}


class Student{
	int id;
	String name;
	int age;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}