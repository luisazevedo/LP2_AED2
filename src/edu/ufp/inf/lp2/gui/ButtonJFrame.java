/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bernardomaia
 */
public class ButtonJFrame extends JFrame {

    public ButtonJFrame(String title) {

        super(title);
        imitComponents();

    }

    public static void main(String argv[]) {

        new ButtonJFrame("Test Button");

    }

    private void imitComponents() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// fecha automaticamente um processo 
        this.southpanel = new JPanel();
        this.okbutton = new JButton("ok");
        this.colorbutton = new JButton("color");

        this.southpanel.setLayout(new GridLayout(1, 2));
        this.southpanel.add(okbutton);
        this.southpanel.add(colorbutton);

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.SOUTH, southpanel);

        this.colorbutton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent c) {

                colorbuttonactionPerformed(c);

            }

        }
        );

        this.okbutton.addActionListener(
                new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                okbuttonactionPerformed(e);

            }

        }
        );

        this.setSize(400, 1000);
        this.setVisible(true);

    }

    public void okbuttonactionPerformed(ActionEvent e) {

        System.out.println("Pressed ok");

    }

    public void colorbuttonactionPerformed(ActionEvent c) {

        Container co = this.getContentPane();
        if (co.getBackground() == Color.BLUE) {

            co.setBackground(Color.WHITE);

        } else {

            co.setBackground(Color.BLUE);

        }

    }

    private JPanel southpanel;
    private JButton okbutton;
    private JButton colorbutton;
}
