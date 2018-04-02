import java.awt.*;
import javax.swing.*;
public class MyJToggleButton{
	public static void main(String[] args){
		JFrame f = new JFrame("JButton");
		JToggleButton tb =  new JToggleButton("JToggleButton");
		//JButton jb = new JButton("JButton");
		//Container cp = f.getContentPane();
		//cp.add(jb);
		f.getContentPane().add(tb);
		f.setSize(200,100);
		f.setVisible(true); 
	}
}