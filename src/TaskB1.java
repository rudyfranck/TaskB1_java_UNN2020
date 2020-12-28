import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskB1 {

    public static void main(String[] args) {


        JFrame frame = new JFrame("FRANCK MOUAFFO GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
        JButton buttonStart = new JButton("Start");
        buttonStart.setSize(50, 100);
        JButton buttonPause = new JButton("Pause");
        buttonPause.setSize(50, 100);
        JButton buttonStop = new JButton("Stop");
        buttonStop.setSize(50, 100);
        JLabel label = new JLabel("pressed a button…");


        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("-----> Start");
            }
        });

        buttonPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("-----> Pause");
            }
        });

        buttonStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("-----> Stop");
            }
        });


        frame.getContentPane().add(buttonStart);
        frame.getContentPane().add(buttonPause);
        frame.getContentPane().add(buttonStop);
        frame.getContentPane().add(label);

        frame.setVisible(true);
    }

}
