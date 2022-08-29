package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Home {

	private JFrame frame;
	private Movie[] movies;
	//Main m = new Main();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		movies = Main.getMovies();
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
		
		JLabel lblMoviePicker = new JLabel("Movie Picker");
		lblMoviePicker.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoviePicker.setFont(new Font("Tahoma", Font.PLAIN, 61));
		lblMoviePicker.setBounds(10, 30, 479, 82);
		frame.getContentPane().add(lblMoviePicker);
		
		JTextArea txtrMovie = new JTextArea();
		txtrMovie.setFont(new Font("Monospaced", Font.PLAIN, 14));
		String s = "";
		for (Movie m: movies){
			s += m.getName() + "\n";
		}
		txtrMovie.setText(s);
		txtrMovie.setEditable(false);
		txtrMovie.setBackground(SystemColor.menu);
		txtrMovie.setBounds(157, 166, 309, 98);
		frame.getContentPane().add(txtrMovie);
		
		JLabel lblChooseBetween = new JLabel("Choose Between:");
		lblChooseBetween.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblChooseBetween.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseBetween.setBounds(10, 123, 479, 32);
		frame.getContentPane().add(lblChooseBetween);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setBounds(223, 317, 46, 32);
		frame.getContentPane().add(lblOr);
		
		JButton btnVote = new JButton("Vote");
		btnVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				GUI.main(null);
			}
		});
		btnVote.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVote.setBounds(304, 294, 132, 82);
		frame.getContentPane().add(btnVote);
		
		JButton button = new JButton("Random");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rando.main(null);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button.setBounds(61, 294, 132, 82);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\s1586814\\Desktop\\Programming\\Eclipse_stuff\\Movie_Picker4\\resources\\icons8-edit-32.png"));
		btnNewButton.setBounds(427, 11, 46, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
