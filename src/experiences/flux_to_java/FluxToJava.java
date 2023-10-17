package experiences.flux_to_java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class FluxToJava {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						final JFrame frame = new JFrame("Layout Responsivo");
			            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			            frame.setSize(600, 400);

			            JPanel panel = new JPanel(new BorderLayout());

			            JTextArea textAreaEsquerda = new JTextArea();
			            textAreaEsquerda.setWrapStyleWord(true);
			            textAreaEsquerda.setLineWrap(true);

			            JTextArea textAreaDireita = new JTextArea();
			            textAreaDireita.setWrapStyleWord(true);
			            textAreaDireita.setLineWrap(true);

			            JButton button = new JButton("Clique-me!");
			            button.setPreferredSize(new Dimension(120, 40));

			            JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
			            centerPanel.add(button);
			            
			            panel.add(textAreaEsquerda, BorderLayout.WEST);
			            panel.add(textAreaDireita, BorderLayout.EAST);
			            panel.add(centerPanel, BorderLayout.CENTER);

			            button.addActionListener(
		            		new ActionListener() {
								public void actionPerformed(ActionEvent e) {
				                    JOptionPane.showMessageDialog(frame, "Botão foi clicado!");
								}
				            }
	            		);

			            frame.add(panel);
			            frame.setVisible(true);
					}
				}
		);
	}
}
