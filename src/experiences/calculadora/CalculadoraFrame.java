package experiences.calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculadoraFrame extends JFrame {
	protected FormPanel formPanel;
	protected RodapePanel rodapePanel;
	public CalculadoraFrame() {
		initialize();
		pack();
	}
	private void initialize() {
		setTitle("Calculadora Juros Composto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(getFormPanel(), BorderLayout.CENTER);
		getContentPane().add(getRodapePanel(), BorderLayout.PAGE_END);
		setResizable(false);
	}
	FormPanel getFormPanel() {
		if(formPanel == null) {
			formPanel = new FormPanel();
		}
		return formPanel;
	}
	protected abstract void calculateButtonActionListener(ActionEvent event);
	protected abstract void cleanButtonActionListener(ActionEvent event);
	protected abstract void closeButtonActionListener(ActionEvent event);
	private RodapePanel getRodapePanel() {
		if(rodapePanel == null) {
			rodapePanel = new RodapePanel();
			rodapePanel.getCalculateButton().addActionListener(this::calculateButtonActionListener);
			rodapePanel.getCleanButton().addActionListener(this::cleanButtonActionListener);
			rodapePanel.getCloseButton().addActionListener(this::closeButtonActionListener);
		}
		return rodapePanel;
	}
}