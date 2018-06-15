package com.LTP;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){


            public void run() {
            new Main();
            }
        });
    }

    public Main(){

        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");

        JFrame window = new JFrame("NotePad");
        window.setSize(800, 600);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}
