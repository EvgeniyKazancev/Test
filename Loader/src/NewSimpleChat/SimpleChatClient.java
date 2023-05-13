package NewSimpleChat;

import com.sun.nio.sctp.SendFailedNotification;
import jdk.net.Sockets;

import javax.swing.*;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

public class SimpleChatClient {
    JTextField out;
    PrintWriter write;
    Socket socket;

    public void go() {
        JFrame window = new JFrame("Simple Chat");
        JPanel myPanel = new JPanel();
        out = new JTextField(20);
        JButton button = new JButton("Send");
        button.addActionListener(new SendButtonListener());
        myPanel.add(out);
        myPanel.add(button);
        window.getContentPane().add(BorderLayout.CENTER,window);
        setUpNetworking();
        window.setVisible(true);
        window.setSize(400,500);
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1",4242);
            write = new PrintWriter(socket.getOutputStream());
            System.out.println(write);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent a){
            try {
                write.println(out.getText());
                write.flush();
            }catch (Exception e){
                e.printStackTrace();
            }
            out.setText("");
            out.requestFocus();
        }
    }
}
