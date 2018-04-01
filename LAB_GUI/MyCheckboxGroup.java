import java.awt.*;
public class MyCheckboxGroup{
	public static void main(String[] args){
		Frame f = new Frame("Frame");
		CheckboxGroup gr = new CheckboxGroup();
		Checkbox ch1 = new Checkbox("Ch1",gr,false);
		Checkbox ch2 = new Checkbox("ch2",gr,false);
		Checkbox ch3 = new Checkbox("ch3",gr,true);
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.setLayout(new FlowLayout());
		f.setSize(300,100);
		f.setVisible(true); 
	}
}