package FrontEnd;

import BackEnd.Calculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(calculator.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
