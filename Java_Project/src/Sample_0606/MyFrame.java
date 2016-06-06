package Sample_0606;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	public MyFrame() {
		// TODO Auto-generated constructor stub
		add(new Mypanel());
		setSize(300, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
class Mypanel extends JPanel {
	BufferedImage img = null;
	int img_x = 0, img_y =0;
	
	public Mypanel() {
		// TODO Auto-generated constructor stub
	try{
		img = ImageIO.read(new File("car.gif"));
	} catch (IOException e){
		System.out.println("no image");;
		System.exit(1);
	}
	
	addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			img_x = e.getX();
			img_y = e.getY();
			repaint();
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
}


public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawImage(img, img_x, img_y, null);
	}
}

