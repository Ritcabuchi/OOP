import java.io.*;

public class TestPoint{
	public static void main(String args[]){
		Point pt1,pt2,pt3;
		pt1 = new Point(1.0,2.0,-1.0);
		pt2 = new Point(2.2,1.1,3.3);
		pt3 = new Point(0,0,0);

		
		System.out.println("Point pt1:" + pt1.getX() + pt1.getY() + pt3.getZ());
		System.out.println("Point pt2:" + pt2.getX() + pt2.getY() + pt2.getZ());
		System.out.println("Point pt3:" + pt3.getX() + pt3.getX() + pt3);
		pt3.setX(3.3);
		pt3.setY(3.3);
		pt3.setZ(3.3);

		pt2.setPoint(pt3);
		pt1.setXYZ(5.5,6.6,7.7);
		System.out.println("Point pt1:" + pt1.getX() + pt1.getY() + pt1.getZ());
		System.out.println("Point pt2:" + pt2.getX() + pt2.getY() + pt2.getZ());
		System.out.println("Point pt3:" + pt3.getX() + pt3.getX() + pt3);
	}
}