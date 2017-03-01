import javafx.scene.paint.Color;
import oracle.jrockit.jfr.JFR;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.*;
import java.io.IOException;
import java.awt.event.MouseEvent;

/**
 * Created by mdb17 on 2/28/2017.
 */
public class Menu extends JFrame {
    public void solve() {
        JPanel file = new JPanel();
        // file.setSize(1000, 400);
        file.setBackground(java.awt.Color.CYAN);
        file.setLocation(800, 500);


        JButton PSU = new JButton("PSU");
        PSU.setLocation(100, 100);
        file.add(PSU);
        PSU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel();
                JFrame frame = new JFrame("Penn State is the B1G CHAMPS");

                JButton button = new JButton("Click here to go back to the previous screen");
                button.setSize(file.getWidth() / 10, file.getHeight() / 10);
                panel.add(button);
                frame.add(panel);
                frame.add(new JLabel(new ImageIcon("back1.jpg")));

                frame.pack();
                frame.setSize(600, 600);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                button.setIcon(new ImageIcon("back1.jpg"));
                button.setText("Click here to go back");
                frame.add(button);
                validate();

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel file = new JPanel();
                        // file.setSize(1000, 400);
                        file.setBackground(java.awt.Color.CYAN);
                        file.setLocation(800, 500);

                        getContentPane();
                        setSize(500, 100);
                        setLocationRelativeTo(null);
                        setVisible(true);
                        frame.getDefaultCloseOperation();


                    }
                });
            }
        });


        JButton OSU = new JButton("OSU");
        OSU.setLocation(200, 100);
        file.add(OSU);


        JButton Michigan = new JButton("Michigan");
        Michigan.setLocation(300, 100);
        file.add(Michigan);


        JButton Wisconsin = new JButton("Wisconsin");
        Wisconsin.setLocation(400, 100);
        file.add(OSU);


        JButton rut = new JButton("Rutgers LMAO");
        rut.setLocation(500, 100);
        file.add(rut);


        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(file);


        getContentPane();
        setSize(500, 100);
        setLocationRelativeTo(null);
        setVisible(true);


    }
}