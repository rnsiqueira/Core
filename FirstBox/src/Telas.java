import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Telas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telas window = new Telas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		menuBar.setSize(240, 250);

		JButton btnNewButton = new JButton("Consultas");
		menuBar.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Operações");
		menuBar.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Configurações");
		menuBar.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Novo item");
		menuBar.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Admin");
		menuBar.add(btnNewButton_4);

		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(scrollPane, BorderLayout.WEST);
	}

}
