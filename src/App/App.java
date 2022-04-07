package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {

    int count = 0;

    public App(){

        setBounds(300,300,300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Counter");
        setResizable(false);

        JLabel counter = new JLabel("0");
        JButton leftButton = new JButton("<");
        JButton rightButton = new JButton(">");

        Font font = new Font("Arial", Font.BOLD, 32);

        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        add(rightButton, BorderLayout.EAST);
        add(leftButton, BorderLayout.WEST);
        add(counter, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }

}
