package head_13.border;

import javax.swing.*;
import java.awt.*;

public class Button1 {
    public static void main(String[] args){
        Button1 gui = new Button1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton button = new JButton("click like you mean it");
        //Задаем область
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
