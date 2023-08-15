package experiences.calculadora;

import javax.swing.*;
import java.awt.*;

public class RodapePanel extends JPanel {
    private JButton calculateButton;
    private JButton cleanButton;
    private JButton closeButton;
    RodapePanel() {
        super(new FlowLayout(FlowLayout.CENTER));
        add(getCalculateButton());
        add(getCleanButton());
        add(getCloseButton());
    }
    JButton getCalculateButton() {
        if(calculateButton == null) {
            calculateButton = new JButton("Calcular");
        }
        return calculateButton;
    }
    JButton getCleanButton() {
        if(cleanButton == null) {
            cleanButton = new JButton("Limpar");
        }
        return cleanButton;
    }
    JButton getCloseButton() {
        if(closeButton == null) {
            closeButton = new JButton("Fechar");
        }
        return closeButton;
    }
}
