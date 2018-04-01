import java.awt.*;
public class MyFileDialog{
	public static void main(String[] args){
		Frame f =  new Frame("Frame");
		FileDialog fd = new FileDialog(f,"FileDialog");
		f.setSize(200,100);
		f.setVisible(true);
		fd.setVisible(true);
	}
}