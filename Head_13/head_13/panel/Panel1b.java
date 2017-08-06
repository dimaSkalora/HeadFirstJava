package head_13.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Panel1b {
	public static void main(String[]args){
		Panel1b gui = new Panel1b();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);
		//Изменяем диспечер комповки на новый экземплярBoxLayout
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton button = new JButton("shock me");
		JButton buttonTwo = new JButton("bliss");

		panel.add(button);
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
