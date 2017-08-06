package head_13.text_area_field;

import javax.swing.*;

import java.awt.*;

public class TextField {
	public static void main(String[]args){
		TextField gui = new TextField();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		//Конструкторы
		JTextField field = new JTextField(10);
		JTextField field2 = new JTextField("Ввод",10);

		//FlowLayout по умолчанию
		panel.add(field);
		panel.add(field2);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
