package gui.finestra_saluda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinestraSaluda extends JFrame {
    private JPanel contentPane;
    private String CANCEL;
    private String OK;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textFieldResposta;
    private String pregunta;
    private final String TITOL;
    private JLabel labelPregunta;
    private JLabel labelResposta;

    public void setLabelResposta(JLabel labelResposta) {
        this.labelResposta = labelResposta;
    }

    private JPanel panelButton;

    public FinestraSaluda() {
        this.TITOL = "Saludant";
        this.setTitle(TITOL);

        this.pregunta = "Com et dius?";
        this.labelPregunta = new JLabel(pregunta);
        this.labelResposta = new JLabel("Diego");

        this.contentPane = new JPanel();

        this.CANCEL = "Cancel·la";
        this.OK = "OK";
        this.buttonOK = new JButton(OK);
        this.buttonCancel = new JButton(CANCEL);

        this.textFieldResposta = new JTextField();
        contentPane.setLayout(new GridLayout(4, 1));
        contentPane.add(labelPregunta);
        contentPane.add(textFieldResposta);
        contentPane.add(labelResposta);

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1, 2));
        panelButton.add(buttonOK);
        panelButton.add(buttonCancel);
        contentPane.add(panelButton);

        setContentPane(contentPane);

        contentPane.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        this.pack();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    public static void main(String[] args) {
        FinestraSaluda frame = new FinestraSaluda();
        frame.setVisible(true);

        JButton labelResposta = new JButton("Resposta");
        labelResposta.setActionCommand("Diego");

        ButtonHandler buttonHandler = new ButtonHandler();
        labelResposta.addActionListener(buttonHandler);
    }
}
class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hola " + e);
    }
}
