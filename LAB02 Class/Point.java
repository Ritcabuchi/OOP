public class Point{
	//attribute
	private double x;
	private double y;
	private double z;
	//contructer 
	public Point(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Point(){}
	//method get
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getZ(){
		return z;
	}
	//method set;
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setZ(double z){
		this.z = z;
	}
	//setPoint
	public  void setPoint(Point setP){
		this.x =  setP.getX();
		this.y =  setP.getY();
		this.z =  setP.getZ();
	}
	public void setXYZ(double x,double y,double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
} 