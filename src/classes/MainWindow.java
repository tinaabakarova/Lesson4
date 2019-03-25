package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        setTitle("ChatIt!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,700);

        JPanel panel = new JPanel();

        JButton button = new JButton("SendIt!");
        JTextArea jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        JTextField textField = new JTextField(25);

        panel.add(textField);
        panel.add(button);

        this.getContentPane().add(BorderLayout.CENTER, jTextArea);
        this.getContentPane().add(BorderLayout.SOUTH, panel);

        setVisible(true);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = jTextArea.getText().concat("\n");
                text = text.concat(textField.getText());
                jTextArea.setText(text);
                textField.setText("");
            }
        });

        textField.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String text = jTextArea.getText().concat("\n");
                text = text.concat(textField.getText());
                jTextArea.setText(text);
                textField.setText("");
            }
        });
    }
}
