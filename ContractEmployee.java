public class ContractEmployee extends Employee{
	private int payment;
	//contructur
	public ContractEmployee(String name ,int age,int employeeID ,int salary){
	   super(name,age,employeeID);
       this.payment=  payment;
		
	}
	//method get 
    public int getPayment(){
      return payment;
    }

    //Method set
    public void setPayment(int payment){
        this.payment = payment;
    }

 

    public void printDetails() {
        System.out.println("------salary--------");
        super.printDetails();
        System.out.println("Payment: " + payment);
    }




} 