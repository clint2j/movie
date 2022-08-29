package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class GUI2 {

	public JFrame frame;
	private Movie[] m;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2();
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
	public GUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		m = Main.getMovies();
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMovieResults = new JLabel("Movie Results:");
		lblMovieResults.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMovieResults.setBounds(170, 11, 191, 76);
		frame.getContentPane().add(lblMovieResults);
		
		JLabel label = new JLabel("1:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 42));
		label.setBounds(22, 94, 47, 40);
		frame.getContentPane().add(label);
		
		JLabel lblMovie = new JLabel(m[4].finToString());
		lblMovie.setToolTipText(m[4].finToString());
		lblMovie.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMovie.setBounds(68, 94, 421, 40);
		frame.getContentPane().add(lblMovie);
		String s = "2: " + m[3].finToString() + "\n3: " + m[2].finToString() + "\n4: " + m[1].finToString() + "\n5: "+ m[0].finToString(); 
		JTextArea txtrRestOfThe = new JTextArea();
		txtrRestOfThe.setEditable(false);
		txtrRestOfThe.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrRestOfThe.setOpaque(false);
		txtrRestOfThe.setText(s);
		txtrRestOfThe.setBounds(22, 162, 420, 212);
		frame.getContentPane().add(txtrRestOfThe);
	}
}
