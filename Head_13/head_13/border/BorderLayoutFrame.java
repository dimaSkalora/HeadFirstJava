package head_13.border;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame {
    public static void main(String[] args){
        BorderLayoutFrame gui = new BorderLayoutFrame();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();

        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");
        //Восток(Правый)
        frame.getContentPane().add(BorderLayout.EAST, east);
        //Запад(Левый)
        frame.getContentPane().add(BorderLayout.WEST, west);
        //Свевер(Вверх)
        frame.getContentPane().add(BorderLayout.NORTH, north);
        //Юг(Вниз)
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        //Центер(Серидина)
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);

    }

}
