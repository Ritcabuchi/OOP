public class Person {

    private String name;
    private int age;

    //Cintructur
    public Person(String n, int a) {
        name = n;
        age = a;
    }
    //Metode get
    public String getName(){
      return name;
    }
    public int getAge(){
      return age;
    }
    //Method set
    public void setName(String name){
        this.name = name;
    }
    public  void setAge(int age){
        this.age = age;
    }

    public void printDetails() {
        System.out.println("------Person--------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
