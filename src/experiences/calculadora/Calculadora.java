package experiences.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends CalculadoraFrame {
	protected void calculateButtonActionListener(ActionEvent event) {
        try {
            final double C = Double.parseDouble(getFormPanel().getCapitalTextField().getText());
            final double i = Double.parseDouble(getFormPanel().getTaxTextField().getText());
            final double t = Double.parseDouble(getFormPanel().getTurnTextField().getText());
            final double result = C*(Math.pow(1+(i/100), t));//M = C (1+i)t
            getFormPanel().getResultTextField().setText(String.format(
            		"%.2f", 
            		new Object[]{new Double(result)})
            );
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    protected void cleanButtonActionListener(ActionEvent event) {
        getFormPanel().cleanTextFields();
    }
    protected void closeButtonActionListener(ActionEvent event) {
        setVisible(false);
        dispose();
    }
}
