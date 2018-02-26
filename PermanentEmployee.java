public class PermanentEmployee extends Employee{
	private float salary;
	//contructur
	public PermanentEmployee(String name ,int age,int employeeID ,float salary){
	   super(name,age,employeeID);
       this.salary=  salary;
		
	}
	//method get 
    public float getSalary(){
      return salary;
    }

    //Method set
    public void setSalary(float salary){
        this.salary = salary;
    }

 

    public void printDetails() {
        System.out.println("------salary--------");
        super.printDetails();
        System.out.println("salary: " + salary);



    }
} 