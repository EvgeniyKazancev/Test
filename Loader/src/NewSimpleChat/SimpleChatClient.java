package NewSimpleChat;

import com.sun.nio.sctp.SendFailedNotification;
import jdk.net.Sockets;

import javax.swing.*;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Locale;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField out;
    BufferedReader reader;
    PrintWriter write;
    Socket socket;

    public static void main(String[] args) {

        new SimpleChatClient().go();
    }

    public void go() {
        JFrame window = new JFrame("Simple Chat");
        JPanel myPanel = new JPanel();
        incoming = new JTextArea();
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qsqrollPanel = new JScrollPane();
        qsqrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qsqrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        out = new JTextField(20);
        JButton buttonSend = new JButton("Send");
        buttonSend.addActionListener(new SendButtonListener());
        myPanel.setBackground(Color.GRAY);
        myPanel.add(qsqrollPanel);
        myPanel.add(out);
        myPanel.add(buttonSend);
        setUpNetworking();
        Thread thread = new Thread(new IncomingReader());
        thread.start();


        window.getContentPane().add(BorderLayout.CENTER, window);
        window.setVisible(true);
        window.setSize(400, 500);
    }

    private void setUpNetworking() {
        try {
            socket = new Socket("127.0.0.1", 8080);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            write = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
//
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            try {
                write.println(out.getText());
                write.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            out.setText("");
            out.requestFocus();
        }
    }

    public class IncomingReader implements Runnable{

        @Override
        public void run() {
            String massage;
            try {
                while ((massage = reader.readLine()) !=null){
                    System.out.println("read" + massage);
                    incoming.append(massage + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
