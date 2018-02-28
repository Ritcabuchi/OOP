public class Student extends Person{
	private String major;
    private float gpa;
	//contructur
	public Student(String name ,int age,String major, float gpa){
	   super(name,age);
       this.major=  major;
       this.gpa= gpa;
		
	}
	//method get 
    public String getMajor(){
      return major;
    }
    public float getGpa(){
      return gpa;
    }
    //Method set
    public void setMajor(String major){
        this.major = major;
    }
    public void setGpa(float gpa){
        this.gpa = gpa;
    }
 

    public void printDetails() {
        System.out.println("------Student--------");
        super.printDetails();
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);


    }

} 