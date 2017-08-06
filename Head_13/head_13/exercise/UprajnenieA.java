package head_13.exercise;

import javax.swing.*;
import java.awt.*;

public class UprajnenieA {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari");
		panel.add(button);
		frame.getContentPane().add(BorderLayout.NORTH, buttonTwo);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
