import java.awt.*;
import javax.swing.*;

public class MyTextField{
	public static void main(String[] args){
		JFrame f = new JFrame("TextField");
		JTextField t = new JTextField("TextField",20);
		Container cp = f.getContentPane();
		t.setBackground(Color.blue);
		cp.add(t,BorderLayout.NORTH);
		f.setSize(200,100);
		f.setVisible(true); 
	}
}