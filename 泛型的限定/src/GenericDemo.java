import java.util.ArrayList;
/*
 ? ͨ�����Ҳ�������Ϊռλ��
 ���͵��޶���
 ? extends E:���Խ���E���ͻ���E�������ͣ��޶�������
 ? super E:���Խ���E���ͻ���E�ĸ����ͣ��޶�������
*/
public class GenericDemo {
	public static void main(String [] args){
				
		ArrayList<Person> al=new ArrayList<>();
		al.add(new Person("����"));
		al.add(new Person("����"));
		
		ArrayList<Student> alist=new ArrayList<>();
		alist.add(new Student("ѧ��AAA"));
		alist.add(new Student("ѧ��BBB"));
		
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