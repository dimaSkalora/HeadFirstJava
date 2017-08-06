package head_13.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Panel1a {
	public static void main(String[]args){
		Panel1a gui = new Panel1a();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");
		JButton buttonTwo2 = new JButton("bli");

		//FlowLayout по умолчанию
		panel.add(button);
		panel.add(buttonTwo);
		panel.add(buttonTwo2);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
