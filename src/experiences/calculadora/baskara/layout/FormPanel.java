package experiences.calculadora.baskara.layout;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    private JLabel alLabel;
    private JTextField aTextField;
    private JLabel bLabel;
    private JTextField bTextField;
    private JLabel cLabel;
    private JTextField cTextField;
    private JLabel resultLabel;
    private JTextField resultTextField;
    private final int TEXT_FIELDS_COLUMNS = 15;
    FormPanel() {
        super(new GridLayout(4, 2));
        getResultTextField().setEditable(false);
        add(getALabel());
        add(getATextField());
        add(getBLabel());
        add(getBTextField());
        add(getCLabel());
        add(getCTextField());
        add(getResultabel());
        add(getResultTextField());
    }
    private JLabel createLabel(String text) {
        final JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
    JLabel getALabel() {
        if(alLabel == null) {
            alLabel = createLabel("a: ");
        }
        return alLabel;
    }
    JLabel getBLabel() {
        if(bLabel == null) {
            bLabel = createLabel("b: ");
        }
        return bLabel;
    }
    JLabel getCLabel() {
        if(cLabel == null) {
            cLabel = createLabel("c: ");
        }
        return cLabel;
    }
    JLabel getResultabel() {
        if(resultLabel == null) {
            resultLabel = createLabel("Resultado: ");
        }
        return resultLabel;
    }
    public JTextField getATextField() {
        if(aTextField == null) {
            aTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return aTextField;
    }
    public JTextField getBTextField() {
        if(bTextField == null) {
            bTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return bTextField;
    }
    public JTextField getCTextField() {
        if(cTextField == null) {
            cTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return cTextField;
    }
    public JTextField getResultTextField() {
        if(resultTextField == null) {
            resultTextField = new JTextField(TEXT_FIELDS_COLUMNS);
        }
        return resultTextField;
    }
    public void cleanTextFields() {
        getResultTextField().setText("");
        getBTextField().setText("");
        getCTextField().setText("");
        getATextField().setText("");
    }
}
