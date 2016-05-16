package Sample_0516;
import java.awt.FlowLayout;

import javax.swing.*;
import java.awt.*;

public class MyFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f = new MyFrame();

	
	}

}

class MyFrame extends JFrame{
	
	public MyFrame() {
		// TODO Auto-generated constructor stub
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(300, 200);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("button");
		this.add(button);
		setVisible(true);
	}
}