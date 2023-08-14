package experiences.calculadora;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculadoraForm extends JFrame {
	protected JPanel formPanel;
	protected JPanel rodapePanel;
	protected JButton calculateButton;
	protected JButton cleanButton;
	protected JButton closeButton;
	protected JLabel capitalLabel;
	protected JTextField capitalTextField;
	protected JLabel taxLabel;
	protected JTextField taxTextField;
	protected JLabel turnLabel;
	protected JTextField turnTextField;
	protected JLabel valueLabel;
	protected JTextField valueTextField;
	public CalculadoraForm() {
		initialize();
	}
	private void initialize() {
 		setTitle("Calculadora Juros Composto");
 		setSize(640, 480); 
 		getContentPane().setLayout(new BorderLayout());
 		getContentPane().add(getRodapePanel());
	}
	private JPanel getFormPanel() {
		if(formPanel == null) {
			formPanel = new JPanel();
		}
		return formPanel;
	}
	private JPanel getRodapePanel() {
		if(rodapePanel == null) {
			rodapePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
			rodapePanel.add(getCalculateButton());
			rodapePanel.add(getCleanButton());
			rodapePanel.add(getCloseButton());
		}
		return rodapePanel;
	}
	private JButton getCalculateButton() {
		if(calculateButton == null) {
			calculateButton = new JButton();
		}
		return calculateButton;
	}
	private JButton getCleanButton() {
		if(cleanButton == null) {
			cleanButton = new JButton();
		}
		return cleanButton;
	}
	private JButton getCloseButton() {
		if(closeButton == null) {
			closeButton = new JButton();
		}
		return closeButton;
	}
}