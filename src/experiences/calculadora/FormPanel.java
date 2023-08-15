package experiences.calculadora;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel capitalLabel;
    private JTextField capitalTextField;
    private JLabel taxLabel;
    private JTextField taxTextField;
    private JLabel turnLabel;
    private JTextField turnTextField;
    private JLabel resultLabel;
    private JTextField resultTextField;
    private final int TEXT_FIELDS_COLUMNS = 15;
    FormPanel() {
        super(new GridLayout(4, 2));
        getResultTextField().setEditable(false);
        add(getCapitalLabel());
        add(getCapitalTextField());
        add(getTaxLabel());
        add(getTaxTextField());
        add(getTurnLabel());
        add(getTurnTextField());
        add(getResultabel());
        add(getResultTextField());
    }
    private JLabel createLabel(String text) {
        final JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
    JLabel getCapitalLabel() {
        if(capitalLabel == null) {
            capitalLabel = createLabel("Capital(R$)");
        }
        return capitalLabel;
    }
    JLabel getTaxLabel() {
        if(taxLabel == null) {
            taxLabel = createLabel("Juros(%)");
        }
        return taxLabel;
    }
    JLabel getTurnLabel() {
        if(turnLabel == null) {
            turnLabel = createLabel("Periodo(meses)");
        }
        return turnLabel;
    }
    JLabel getResultabel() {
        if(resultLabel == null) {
            resultLabel = createLabel("Montante(R$)");
        }
        return resultLabel;
    }
    JTextField getCapitalTextField() {
        if(capitalTextField == null) {
            capitalTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return capitalTextField;
    }
    JTextField getTaxTextField() {
        if(taxTextField == null) {
            taxTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return taxTextField;
    }
    JTextField getTurnTextField() {
        if(turnTextField == null) {
            turnTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return turnTextField;
    }
    JTextField getResultTextField() {
        if(resultTextField == null) {
            resultTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return resultTextField;
    }
    void cleanTextFields() {
        getResultTextField().setText("");
        getTaxTextField().setText("");
        getTurnTextField().setText("");
        getCapitalTextField().setText("");
    }
}
