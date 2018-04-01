import java.awt.*;
public class MyFlowLayout{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Panel p = new Panel();
		Label l = new Label("Name");
		TextField tf = new TextField("TextField");
		Button bt = new Button("Login");
		p.add(l);
		p.add(tf);
		p.add(bt);
		f.add(p);
		f.setSize(150,150);
		f.setVisible(true);
 	}	
}