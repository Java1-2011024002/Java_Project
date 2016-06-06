package Sample_0606;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener {
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame() {
		// TODO Auto-generated constructor stub
		setTitle("Text Area Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		textArea.setEditable(false);
		
		//add(textArea, BorderLayout.CENTER);
		add(scrollPane, BorderLayout.CENTER);
		add(textField, BorderLayout.NORTH);
	
		
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaFrame();
	}

}
