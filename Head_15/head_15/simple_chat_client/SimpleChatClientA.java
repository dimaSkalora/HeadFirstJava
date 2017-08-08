package head_15.simple_chat_client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

    public void go(){
        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel maimPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        maimPanel.add(outgoing);
        maimPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, maimPanel);
        setUpNetworking();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setVisible(true);
    }

    private void setUpNetworking(){
        try {
            sock = new Socket("127.0.0.1",5000);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}
