import java.awt.*;
public class MyCheckbox{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		Checkbox ch1 = new Checkbox("Ch1",true);
		Checkbox ch2 = new Checkbox("ch2",false);
		Checkbox ch3 = new Checkbox("ch3",true);
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.setLayout(new FlowLayout());
		f.setSize(300,100);
		f.setVisible(true); 
	}
}