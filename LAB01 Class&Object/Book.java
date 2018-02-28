public class Book
{
	//attributes
	private String title;
	private int numberOfPage;
	private String autherName;
	//Contructer
	public Book(){}
	public Book(String title){
		this.title = title;
	}
	public Book(String title,int numberOfPage){
		this.title = title;
		this.numberOfPage = numberOfPage;
	}
	public Book(String title,int numberOfPage,String autherName){
		this.title = title;
		this.numberOfPage = numberOfPage;
		this.autherName = autherName;
	}
	//methods getter
	public String getTitle(){
		return title;
	}
	public int getNumberofpage(){
		return numberOfPage;
	}
	public String getAutherName(){
		return autherName;
	}
	//methods setter
	public void setTitle(String title){
		this.title = title;
	}
	public void setNumberofpage(int numberOfPage){
		this.numberOfPage = numberOfPage;
	}
	public void setAutherName(String autherName){
		this.autherName = autherName;
	}
	public Boolean comp(Book book){
		if(this.title==book.getTitle()&&this.numberOfPage==book.getNumberofpage()&&this.autherName==book.getAutherName()){
			return true;
		}
		else
			return false;
	}

}