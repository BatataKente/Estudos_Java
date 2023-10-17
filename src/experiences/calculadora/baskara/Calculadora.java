package experiences.calculadora.baskara;

import java.awt.event.ActionEvent;

import experiences.calculadora.baskara.layout.CalculadoraFrame;
import experiences.calculadora.baskara.utils.Baskara;
import experiences.calculadora.baskara.utils.ErrorFrame;
import experiences.calculadora.baskara.utils.Roots;

public class Calculadora extends CalculadoraFrame {
	protected void calculateButtonActionListener(ActionEvent event) {
		try {
			Roots roots;
			double a = Double.parseDouble(getFormPanel().getATextField().getText());
			double b = Double.parseDouble(getFormPanel().getBTextField().getText());
			double c = Double.parseDouble(getFormPanel().getCTextField().getText());
			roots = Baskara.calculate(a, b, c);
			getFormPanel().getResultTextField().setText(roots.toString());
		} catch (Exception exception) {
			exception.printStackTrace();
			getFormPanel().getResultTextField().setText(exception.getMessage());
		}
    }
    protected void cleanButtonActionListener(ActionEvent event) {
        getFormPanel().cleanTextFields();
    }
    protected void closeButtonActionListener(ActionEvent event) {
        setVisible(false);
        dispose();
    }
	public Calculadora() {
		super("Calculadora Baskara");
	}
}
