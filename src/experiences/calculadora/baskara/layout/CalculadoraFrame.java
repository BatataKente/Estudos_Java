package experiences.calculadora.baskara.layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class CalculadoraFrame extends JFrame {
	protected FormPanel formPanel;
	protected RodapePanel rodapePanel;
	public CalculadoraFrame(String title) {
		setTitle(title);
		initialize();
		pack();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(getFormPanel(), BorderLayout.CENTER);
		getContentPane().add(getRodapePanel(), BorderLayout.PAGE_END);
		setVisible(true);
		setResizable(false);
	}
	protected FormPanel getFormPanel() {
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
			rodapePanel.getCalculateButton().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						calculateButtonActionListener(event);
					}
				}
			);
			rodapePanel.getCleanButton().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						cleanButtonActionListener(event);
					}
				}
			);
			rodapePanel.getCloseButton().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						closeButtonActionListener(event);
					}
				}
			);
		}
		return rodapePanel;
	}
}