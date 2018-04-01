import java.awt.*;
public class MyButton{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Button b = new Button("Button");
	 	f.add(b);
	 	b.setBackground(Color.blue);
	 	f.setSize(200,100);
	 	f.setVisible(true);

	}
}