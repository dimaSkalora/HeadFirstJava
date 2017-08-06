package head_13.text_area_field;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.*;

public class TextArea1 {
	public static void main(String[]args){
		TextArea1 gui = new TextArea1();
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

		//1
		JScrollPane scroller = new JScrollPane(text);
		//Включаем перенос текста
		text.setLineWrap(true);
		//Прокрутка
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);

		//2
		text.setText("swwwegfe");

		//3
		text.append("Кнопка нажаат");
		//4
		text.selectAll();
		//5
		text.requestFocus();

		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
