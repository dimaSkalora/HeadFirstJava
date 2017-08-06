package head_13.text_area_field;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TextArea {
	public static void main(String[]args){
		TextArea gui = new TextArea();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		//Конструктор
		//10-строк, 20 - столбцов
		JTextArea text = new JTextArea(10,20);


		//FlowLayout по умолчанию
		panel.add(text);

		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
