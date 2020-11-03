package ru.geekbrains.lesson_4.chatWindow;

import javax.swing.*;
import java.awt.*;

public class ChatWindow{

    private JFrame mainFrame = new JFrame();

    public ChatWindow() {

        //Main frame
        mainFrame.setTitle("GbChat");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(700, 200, 300, 600);

        //Grid
        mainFrame.setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JPanel bottomArea = new JPanel();
        bottom.add(bottomArea, BorderLayout.EAST);

        //Out text field
        final JTextArea msgField = new JTextArea();
        msgField.setEditable(false);
        top.add(msgField);

        //Send text field
        final JTextField sendField = new JTextField();
        bottom.add(sendField);

        //Send button
        JButton sendBtn = new JButton("Send");
        bottomArea.add(sendBtn, BorderLayout.EAST);

        //Add Listener
        Listener btnListener = new Listener(msgField, sendField);
        sendBtn.addActionListener(btnListener);
        sendField.addActionListener(btnListener);


        mainFrame.setVisible(true);
        mainFrame.add(top, BorderLayout.CENTER);
        mainFrame.add(bottom, BorderLayout.SOUTH);
        sendField.requestFocusInWindow();
    }
}
