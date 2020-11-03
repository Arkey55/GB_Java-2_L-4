package ru.geekbrains.lesson_4.chatWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {
    private JTextArea msgField;
    private JTextField sendField;

    public Listener(JTextArea msgField, JTextField sendField) {
        this.msgField = msgField;
        this.sendField = sendField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (sendField.getText().equals("")){
            sendField.setText("");
            sendField.requestFocusInWindow();
        } else {
            msgField.setText(msgField.getText() + "\n" + sendField.getText());
            sendField.setText("");
            sendField.requestFocusInWindow();
        }
    }
}
