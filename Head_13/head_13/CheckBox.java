package head_13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;


public class CheckBox {
	public static void main(String[]args){
		CheckBox gui = new CheckBox();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		JCheckBox check = new JCheckBox("Goes to 11");

		//Как использовать флажок
		//1 Отслежуем событие флажка(установлен он или снят)
		//check.addItemListener(this);

		//2Обрабатываем событие и определяем установлен флажок или нет
		/*public void itemStateChanged(ItemEvent ev){
			String onOroff="off";
			if(check.isSelected()) onOrOff="on";
			System.out.println("Check box is "+ onOrOff);
		}*/
		//3Устанавливаем или снимаем флажок
		check.setSelected(true);
		check.setSelected(false);

		//FlowLayout по умолчанию
		panel.add(check);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
