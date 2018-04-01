import java.awt.*;
public class MyTextArea{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		TextArea ta = new TextArea("Text",5,20);
		ta.setBackground(Color.yellow);
		f.add(ta);
		f.pack();
		f.setLayout(new FlowLayout());
		f.setSize(200,100);
		f.setVisible(true);
	}
}