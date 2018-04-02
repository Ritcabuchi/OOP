import java.awt.*;
import javax.swing.*;
public class MyJButton{
	public static void main(String[] args){
		JFrame f = new JFrame("JButton");
		JButton jb = new JButton("JButton");
		//Container cp = f.getContentPane();
		//cp.add(jb);
		f.getContentPane().add(jb);
		f.setSize(200,100);
		f.setVisible(true); 
	}
}