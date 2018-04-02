import java.awt.*;
import javax.swing.*;
public class MyJLabel{
	public static void main(String[] args){
		JFrame f = new JFrame("JButton");
		JLabel l =  new JLabel("JLabel");
		//JButton jb = new JButton("JButton");
		//Container cp = f.getContentPane();
		//cp.add(jb);
		f.getContentPane().add(l,BorderLayout.CENTER);
		f.setSize(200,100);
		f.setVisible(true); 
	}
}