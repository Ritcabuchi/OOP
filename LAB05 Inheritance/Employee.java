public class Employee extends Person{
	private int employeeID;
	//contructur
	public Employee(String name,int age,int employeeID){
		super(name,age);
		this.employeeID = employeeID;
		
	}
	//method get 
    public int getEmployeeID(){
      return employeeID;
    }
    //Method set
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
 

    public void printDetails() {
        System.out.println("------Employee--------");
        super.printDetails();
        System.out.println("EmployeeID: " + employeeID);
    }



} 