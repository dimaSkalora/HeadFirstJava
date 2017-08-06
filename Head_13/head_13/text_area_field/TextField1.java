package head_13.text_area_field;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField1 {
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

		//1 Извлекаем из него текст
		System.out.println(field.getText());
		//2 Помещаем в поле текст
		field.setText("Что угодно");
		field.setText("");
		//3 Получаем событие ActionEvent
		//field.addActionListener(myAcrionListener);
		//4 Выделяем текст в поле
		field.selectAll();
		//5 Помещзаем курсор назад в поле
		field.requestFocus();


		//FlowLayout по умолчанию
		panel.add(field);
		panel.add(field2);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
