package head_13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class JList_13 {
	public static void main(String[]args){
		JList_13 gui = new JList_13();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		//Создаем панель серой что бы разлечать ее на фоне фрейма
		panel.setBackground(Color.darkGray);

		String [] listEntries = {"alpha","dwfw","wfdwf","sssss","dddddd","fffffff",
				"aaaaaaaa","xxxx","fffwws","www","ddd","zaqwsx"};
		JList list = new JList(listEntries);

		//Как использовать список
		//1
		JScrollPane scroller = new JScrollPane(list);
		//Прокрутка
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);

		//2Устанавливаем количество строк до прокрутки
		list.setVisibleRowCount(4);
		//3Ограничиваем выбор до одной строки
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//4 Регистрируем событие выбора в списке
		//list.addListSelectionListener(this);
		//5 Обрабатываем событие(Выясняем какая строка в списке была выбрана)
		/*
		 * public void valueChanged(ListSelectiionEvent lse){
		 * if(!lse.getValueIsAdjusting()){
		 * }String selection = (String) list.getSelectedValue();
		 * System.out.println(selection);
		 * }
		 * */

		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}
