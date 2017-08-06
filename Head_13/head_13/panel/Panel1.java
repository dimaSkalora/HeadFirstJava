package head_13.panel;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
	public static void main(String[]args){
		Panel1 gui = new Panel1();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		JButton button = new JButton("shock me");
		//FlowLayout по умолчанию
		panel.add(button);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
}
