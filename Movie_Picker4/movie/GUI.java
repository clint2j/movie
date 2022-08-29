package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GUI {

	public JFrame frame;
	private Movie[] movies;
	int f;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		movies = Main.getMovies();
		initialize();
		f=0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMostWantTo = new JLabel("Most Want to watch");
		lblMostWantTo.setBounds(207, 57, 117, 14);
		frame.getContentPane().add(lblMostWantTo);
		
		JLabel lblLeastWantTo = new JLabel("Least Want to watch");
		lblLeastWantTo.setBounds(207, 327, 117, 14);
		frame.getContentPane().add(lblLeastWantTo);
//		Main m = new Main();
//		Movie[] movies = m.getMovies();
		
		JComboBox comboBox = new JComboBox(movies);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setToolTipText(movies[comboBox.getSelectedIndex()].getDes());
			}
		});
		comboBox.setToolTipText(movies[0].getDes());
		comboBox.setBounds(51, 82, 400, 38);
		comboBox.setSelectedIndex(0);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(movies);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_1.setToolTipText(movies[comboBox_1.getSelectedIndex()].getDes());
			}
		});
		comboBox_1.setToolTipText(movies[1].getDes());
		comboBox_1.setBounds(51, 131, 400, 38);
		comboBox_1.setSelectedIndex(1);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(movies);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_2.setToolTipText(movies[comboBox_2.getSelectedIndex()].getDes());
			}
		});
		comboBox_2.setToolTipText(movies[2].getDes());
		comboBox_2.setBounds(51, 180, 400, 38);
		comboBox_2.setSelectedIndex(2);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(movies);
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_3.setToolTipText(movies[comboBox_3.getSelectedIndex()].getDes());
			}
		});
		comboBox_3.setToolTipText(movies[3].getDes());
		comboBox_3.setBounds(51, 229, 400, 38);
		comboBox_3.setSelectedIndex(3);
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(movies);
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_4.setToolTipText(movies[comboBox_4.getSelectedIndex()].getDes());
			}
		});
		comboBox_4.setToolTipText(movies[4].getDes());
		comboBox_4.setBounds(51, 278, 400, 38);
		comboBox_4.setSelectedIndex(4);
		frame.getContentPane().add(comboBox_4);
		
		JLabel lblNumOfSelections = new JLabel("0");
		lblNumOfSelections.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNumOfSelections.setBounds(434, 11, 55, 55);
		frame.getContentPane().add(lblNumOfSelections);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] votes = {comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex(), comboBox_2.getSelectedIndex(), comboBox_3.getSelectedIndex(), comboBox_4.getSelectedIndex()};
				if (test(votes)){
				movies[comboBox.getSelectedIndex()].addVotes(15);
				movies[comboBox_1.getSelectedIndex()].addVotes(9);
				movies[comboBox_2.getSelectedIndex()].addVotes(6);
				movies[comboBox_3.getSelectedIndex()].addVotes(3);
				System.out.println(Main.printVotes());
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(1);
				comboBox_2.setSelectedIndex(2);
				comboBox_3.setSelectedIndex(3);
				comboBox_4.setSelectedIndex(4);
				f++;
				lblNumOfSelections.setText("" + f);
			}
				else {
					JOptionPane.showMessageDialog(null, "You can't repeat movies");
				}
			if (f > 5){
				Main.submit();
			}
			}
		});
		btnNewButton.setBounds(173, 352, 172, 41);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblMoviePicker = new JLabel("Movie Picker");
		lblMoviePicker.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoviePicker.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMoviePicker.setBounds(173, 11, 180, 28);
		frame.getContentPane().add(lblMoviePicker);
		
	}
	public boolean test(int[] arr){
		System.out.println("" + arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
		for (int i = 0; i<arr.length-1;i++){
			for (int f = i+1; f<arr.length;f++){
				if (arr[i]==arr[f]){
					return false;
				}
			}
		}
		return true;
	}
}
