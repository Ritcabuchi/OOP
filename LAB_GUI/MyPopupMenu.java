import java.awt.*;
public class MyPopupMenu{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Label l = new Label("LABEL");
		PopupMenu p = new PopupMenu();
		MenuItem m1 = new MenuItem("Popup1");
		MenuItem m2 = new MenuItem("Popup2");
		MenuItem m3 = new MenuItem("Popup3");
		f.add(l,BorderLayout.NORTH);
		p.add(m1);
		p.add(m2);
		p.add(m3);
		f.add(p);
		f.setSize(200,100);
		f.setVisible(true);
		p.show(l,50,20);

	}
}