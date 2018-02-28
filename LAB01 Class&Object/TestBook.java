import java.io.*;
public class TestBook{
	public static void main(String args[]){
		Book mybook1,mybook2,mybook3,mybook4;
		mybook1 = new Book();
		mybook2 = new Book("Java Programming");
		mybook3 = new Book("C Programming",500);
		mybook4 = new Book("C Programming",500);
		mybook1.setTitle("OOP");
		mybook1.setNumberofpage(1000);
		mybook2.setTitle("Network");
		mybook2.setNumberofpage(600);

		System.out.println("mybook1:" + mybook1.getTitle() + mybook1.getNumberofpage());
		System.out.println("mybook2:" + mybook2.getTitle() + mybook2.getNumberofpage());
		System.out.println("mybook3:" + mybook3.getTitle() + mybook3.getNumberofpage());
		System.out.println("mybook4:" + mybook4.getTitle() + mybook4.getNumberofpage());
		System.out.println("----------------------------------------------");
		System.out.println("Compare between mybook1 and mybook2:"+ mybook1.comp(mybook2));
		System.out.println("Compare between mybook3 and mybook4:"+ mybook3.comp(mybook4));

	
	}

}