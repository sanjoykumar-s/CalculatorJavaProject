package BackEnd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public JPanel panel1;
    private JTextField textField1;
    private JButton OFFButton;
    private JButton backButton;
    private JButton ACbutton;
    private JButton Multiplybutton;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button0;
    private JButton button00;
    private JButton dotButton;
    private JButton equalButon;
    private JButton plusButton;
    private JButton minusButton;
    private JButton divButton;
    private JLabel Level;
    private int cal;
    private boolean isDisable = false;

    public Calculator() {

        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '0');
            }
        });
        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "00");
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '.');
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '1');
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '2');
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '3');
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '4');
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '5');
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '6');
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '7');
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '8');
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + '9');
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation.num = Double.parseDouble(textField1.getText());
                textField1.setText("");
                Level.setText(arithmeticOperation.num + " +");
                cal=1;
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation.num = Double.parseDouble(textField1.getText());
                textField1.setText("");
                Level.setText(arithmeticOperation.num + " -");
                cal=2;
            }
        });
        Multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation.num = Double.parseDouble(textField1.getText());
                textField1.setText("");
                Level.setText(arithmeticOperation.num + " *");
                cal=3;
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmeticOperation.num = Double.parseDouble(textField1.getText());
                textField1.setText("");
                Level.setText(arithmeticOperation.num + " /");
                cal=4;
            }
        });
        equalButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double ans = arithmeticOperation.operation(textField1.getText(),cal);
                Level.setText(" ");
                textField1.setText(Double.toString(ans));
            }
        });
        ACbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isDisable)enable();
                arithmeticOperation.num = 0;
                textField1.setText("");
                Level.setText(" ");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                int number = length-1;
                if(length > 0)
                {
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(number);
                    textField1.setText(back.toString());
                }
            }
        });
        OFFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });
    }
    private void enable()
    {
        textField1.setEnabled(true);
        button0.setEnabled(true);
        button00.setEnabled(true);
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        dotButton.setEnabled(true);
        plusButton.setEnabled(true);
        minusButton.setEnabled(true);
        divButton.setEnabled(true);
        Multiplybutton.setEnabled(true);
        backButton.setEnabled(true);
        OFFButton.setEnabled(true);
        equalButon.setEnabled(true);
        isDisable = false;
    }
    private void disable()
    {
        isDisable = true;
        textField1.setText("");
        textField1.setEnabled(false);
        button0.setEnabled(false);
        button00.setEnabled(false);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        dotButton.setEnabled(false);
        plusButton.setEnabled(false);
        minusButton.setEnabled(false);
        divButton.setEnabled(false);
        Multiplybutton.setEnabled(false);
        backButton.setEnabled(false);
        OFFButton.setEnabled(false);
        equalButon.setEnabled(false);
    }
}
