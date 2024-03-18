package gui.ex3;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JPanel content;
    private String titol;
    private JPanel calcScreen;
    private JLabel calcButtons;
    private JLabel calcRow1;
    public Calculator() {
        this.titol = "Calculadora";
        this.setTitle(titol);
        setSize(600, 300);

        this.content = new JPanel(new GridLayout(4, 1));
        this.calcScreen = new JPanel(new GridLayout(1, 1));
        this.calcScreen.setBackground(Color.black);

        content.add(calcScreen);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}
