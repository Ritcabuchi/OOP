import java.awt.*;
public class MyTextField{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		TextField tf = new TextField("Text",50);
		tf.setBackground(Color.yellow);
		f.add(tf);
		f.pack();
		f.setLayout(new FlowLayout());
		f.setSize(200,100);
		f.setVisible(true);
	}
}