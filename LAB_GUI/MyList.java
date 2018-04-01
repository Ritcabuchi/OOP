import java.awt.*;
public class MyList{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		List l = new List(5);
		l.add("List1");
		l.add("List2");
		l.add("List3");
		l.add("List4");
		l.add("List5");
		f.add(l);
		f.setLayout(new FlowLayout());
		l.setBackground(Color.blue);
		f.pack();
		f.setVisible(true);
	}
}