package experiences.calculadora;

import java.awt.event.ActionEvent;

public class Calculadora extends CalculadoraFrame {

    @Override
    protected void calculateButtonActionListener(ActionEvent event) {
        //M = C (1+i)t
        try {
            final double C = Double.parseDouble(getFormPanel().getCapitalTextField().getText());
            final double i = Double.parseDouble(getFormPanel().getTaxTextField().getText());
            final double t = Double.parseDouble(getFormPanel().getTurnTextField().getText());
            final double result = C*(Math.pow(1+(i/100), t));
            getFormPanel().getResultTextField().setText(String.format("%.2f", new Object[]{result}));
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    @Override
    protected void cleanButtonActionListener(ActionEvent event) {
        getFormPanel().cleanTextFields();
    }
    @Override
    protected void closeButtonActionListener(ActionEvent event) {
        setVisible(false);
        dispose();
    }
}
