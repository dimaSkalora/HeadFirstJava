package head_13.border;

import javax.swing.*;
import java.awt.*;

public class Button3 {
    public static void main(String[] args){
        Button3 gui = new Button3();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click This!");
        //Увеличение размера шрифта заставитьь фрейм назначить больше места для высоты кнопки
        Font bigFont = new Font("serif", Font.BOLD,28);
        button.setFont(bigFont);
        //Задаем область
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
