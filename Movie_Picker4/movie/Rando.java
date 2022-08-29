package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class Rando {

	private JFrame frame;
	private Movie[] movies; 
	//Main m = new Main();
	private int rand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rando window = new Rando();
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
	public Rando() {
		movies = Main.getMovies();
		rand = (int)(Math.random()*movies.length);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYourMovieOf = new JLabel("Your Movie is ..... ");
		lblYourMovieOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourMovieOf.setFont(new Font("Tahoma", Font.PLAIN, 61));
		lblYourMovieOf.setBounds(10, 45, 479, 62);
		frame.getContentPane().add(lblYourMovieOf);
		
		JLabel lblMovie = new JLabel(movies[rand].getName());
		lblMovie.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblMovie.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovie.setBounds(20, 137, 445, 151);
		frame.getContentPane().add(lblMovie);
		
		Movie m = movies[rand];
		JLabel lblNewLabel = new JLabel(m.getName() +  " | IMDB: " + m.getIMDB() + " | Length " + m.getLength() + " | Genre: " + m.getGenre());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 276, 479, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrTransportedToBarsoom = new JTextArea();
		txtrTransportedToBarsoom.setEditable(false);
		txtrTransportedToBarsoom.setWrapStyleWord(true);
		txtrTransportedToBarsoom.setLineWrap(true);
		txtrTransportedToBarsoom.setText(m.getDes());
		txtrTransportedToBarsoom.setBackground(SystemColor.menu);
		txtrTransportedToBarsoom.setBounds(40, 313, 425, 91);
		frame.getContentPane().add(txtrTransportedToBarsoom);
	}

}
