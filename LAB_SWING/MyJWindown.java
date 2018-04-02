import java.awt.*;
import javax.swing.*;
public class MyJWindown{
	public static void main(String[] args){
		JLabel l = new JLabel("JLabel");
		JWindow w = new JWindow();
		Container cp = w.getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(l);
		w.pack();
		w.show();
	}
}