package Sample_0516;

import javax.swing.*;
import java.awt.*;

public class Pizza extends JFrame{
	
	public Pizza() {
		// TODO Auto-generated constructor stub
		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pizza");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
  
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);

		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ������");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
  
		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);
  
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
  

	}
	
}
