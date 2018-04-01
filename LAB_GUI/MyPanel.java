import java.awt.*;
public class MyPanel{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Panel p = new Panel();
		p.setSize(100,50);
		p.setBackground(Color.yellow);
		f.setLayout(null);
		
		f.setSize(200,100);
		f.setBackground(Color.blue);
		f.add(p);
		f.setVisible(true);
	}
}