package com.Application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel framePanel;
    private JButton increaseButton;
    private JButton decreaseButton;
    private JButton restartButton;
    private JLabel CounterLabel;
    private JTextField resultField;


    public App(){

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //Retrieve number entered by user
                int number = Integer.parseInt(resultField.getText());

                //check each button and update number
                if (actionEvent.getSource()== increaseButton){
                    ++number;
                    resultField.setText(String.valueOf(number));

                } else if (actionEvent.getSource()== decreaseButton) {
                    --number;
                    resultField.setText(String.valueOf(number));

                }else {
                    number=0;
                    resultField.setText(String.valueOf(number));
                }
            }
        };
        //Add actionlistener to component
        resultField.addActionListener(listener);
        increaseButton.addActionListener(listener);
        decreaseButton.addActionListener(listener);
        restartButton.addActionListener(listener);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().framePanel);
       frame.setLocationRelativeTo(null);
        frame.getDefaultCloseOperation();
       frame.setSize(550,80);
       frame.setVisible(true);
    }
}
