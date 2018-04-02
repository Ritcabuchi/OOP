import java.awt.*;
import javax.swing.*;
public class MyDialog{
	public  static void main(String[] args){
		JDialog d = new JDialog();
		d.setTitle("JDialog");
		d.setSize(300,100);
		d.setLocation(50,50);
		JPanel p = new JPanel();
		Icon img1 = new ImageIcon("pic/JIcon.jpg");
		Icon img2 = new ImageIcon("pic/JIcon.jpg");
		JLabel l1 = new JLabel(img1);
		JLabel l2 = new JLabel(img2);
		JButton bt1 = new JButton("ok");
		JButton bt2 = new JButton("Cancel");
		p.setLayout(new FlowLayout());
		p.add(l1);
		p.add(bt1);
		p.add(l2);
		p.add(bt2);
		d.getContentPane().add(p);
		d.setVisible(true);

	}
}