import java.util.*;
public class StudentList{
	//ArrayList
	private ArrayList<Student> StudentList;
	//contructer
	public StudentList(){
		this.StudentList = new ArrayList<Student>();
	}
	public void addStudent(Student std){
		this.StudentList.add(std);
	}
	public boolean removeStudentBystCode(String stdCode){
		int index = searchStudentBystCode(stdCode);
		if(index<0)
			return false;
		this.StudentList.remove(index);
			return true;
	}
	public void showAllStudentInfo(){
		for(Student std:this.StudentList){
			System.out.println(std.toString());
		}
	}
	public int searchStudentBystCode(String stdCode){
		for(int i=0;i<getNumberOfStudent();i++){
			Student s = StudentList.get(i);
			if(s.getCode()==stdCode)
				return i;
		}
		return -1;
	}
	public int getNumberOfStudent(){
		return this.StudentList.size();
	}
}