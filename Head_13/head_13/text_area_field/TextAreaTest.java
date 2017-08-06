package head_13.text_area_field;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.*;


public class TextAreaTest implements ActionListener{
	JTextArea text;

	public static void main(String[]args){
		TextAreaTest gui = new TextAreaTest();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		button.addActionListener(this);
		text = new JTextArea(10,20);
		text.setLineWrap(true);

		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		JScrollPane scroller = new JScrollPane(text);
		//Прокрутка
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);

		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);

		frame.setSize(350, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ev){
		text.append("button clicked \n");
	}
}