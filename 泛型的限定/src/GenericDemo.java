import java.util.ArrayList;
/*
 ? 通配符，也可以理解为占位符
 泛型的限定：
 ? extends E:可以接受E类型或者E的子类型，限定了上限
 ? super E:可以接受E类型或者E的父类型，限定了下限
*/
public class GenericDemo {
	public static void main(String [] args){
				
		ArrayList<Person> al=new ArrayList<>();
		al.add(new Person("张三"));
		al.add(new Person("李四"));
		
		ArrayList<Student> alist=new ArrayList<>();
		alist.add(new Student("学生AAA"));
		alist.add(new Student("学生BBB"));
		
        printColl(al);
        printColl(alist);
}

	public static void printColl(ArrayList<? extends Person> al){
		
		for(int i=0;i<al.size();i++){
			 System.out.println(al.get(i).getName());
		}
	}
		
}

class Person{
	
	private String name;

	public Person(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}

class Student extends Person{

	public Student(String name) {
		super(name);

	}
	
}