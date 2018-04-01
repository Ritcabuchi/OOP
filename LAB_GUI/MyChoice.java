import java.awt.*;
public class MyChoice{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Choice c = new Choice();
		c.addItem("Choice1");
		c.addItem("Choice2");
		c.addItem("Choice3");
		c.setSize(100,50);
		f.add(c,BorderLayout.NORTH);
		//f.add(c);
		f.setBackground(Color.black);
		f.setSize(200,100);
		f.setVisible(true);

	}
}