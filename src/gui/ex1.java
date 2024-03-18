package gui;

import javax.swing.*;

public class ex1 {
    public static void main(String[] args) {
        JFrame window = new JFrame("My window");

        window.setSize(300, 200);
        window.setVisible(true);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
