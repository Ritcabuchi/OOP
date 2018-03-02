public class Student{
	//artrubute
	private String stCode;
	private String name;
	private double gpa;
	//contructer
	public Student(){}
	public Student(String c,String nm, double g){
		stCode = c;
		name = nm;
		gpa = g;
	}
	//methode get
	public String getCode(){
		return stCode;
	}
	public String getName(){
		return name;
	}
	public double getGPA(){
		return gpa;
	}
	public void setGPA(double g){
		gpa = g;
	}
	public String toString(){
		String s = stCode + " " + name + " " + gpa; 
		return s;
	}
}