import java.io.*;
public class TestStudentList{
	public static void main(String[] args){
		StudentList list = new StudentList();
		Student s1 = new Student("5835512044","RIDUWAN SOOLAEH",3.99);
		Student s2 = new Student("5835512045","Chunjava Suttirak",3.88);
		Student s3 = new Student("5835512046","Yakdee nahjava",3.77);
		Student s4 = new Student("5835512047","chunget A",3.66);

		list.addStudent(s1);
		list.addStudent(s2);
		list.addStudent(s3);
		list.addStudent(s4);

		list.showAllStudentInfo();
		System.out.println("NumOfStudent = " + list.getNumberOfStudent());

		list.removeStudentBystCode("5835512047");
		System.out.println("A student is removed.");

		list.showAllStudentInfo();
		System.out.println("NumOfStudent = " + list.getNumberOfStudent());
	}
}