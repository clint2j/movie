package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Settings {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings window = new Settings();
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
	public Settings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{56, 46, 46, 111, 35, 155, 0};
		gridBagLayout.rowHeights = new int[]{71, 280, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lblEdit = new GridBagConstraints();
		gbc_lblEdit.anchor = GridBagConstraints.NORTH;
		gbc_lblEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEdit.insets = new Insets(0, 0, 5, 0);
		gbc_lblEdit.gridwidth = 6;
		gbc_lblEdit.gridx = 0;
		gbc_lblEdit.gridy = 0;
		frame.getContentPane().add(lblEdit, gbc_lblEdit);
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.SOUTH;
		gbc_lblName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		frame.getContentPane().add(lblName, gbc_lblName);
		
		JLabel lblImdb = new JLabel("IMDB");
		lblImdb.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblImdb = new GridBagConstraints();
		gbc_lblImdb.anchor = GridBagConstraints.SOUTH;
		gbc_lblImdb.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblImdb.insets = new Insets(0, 0, 5, 5);
		gbc_lblImdb.gridx = 1;
		gbc_lblImdb.gridy = 0;
		frame.getContentPane().add(lblImdb, gbc_lblImdb);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblLength = new GridBagConstraints();
		gbc_lblLength.anchor = GridBagConstraints.SOUTH;
		gbc_lblLength.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblLength.insets = new Insets(0, 0, 5, 5);
		gbc_lblLength.gridx = 2;
		gbc_lblLength.gridy = 0;
		frame.getContentPane().add(lblLength, gbc_lblLength);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblGenre = new GridBagConstraints();
		gbc_lblGenre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblGenre.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenre.gridx = 3;
		gbc_lblGenre.gridy = 0;
		frame.getContentPane().add(lblGenre, gbc_lblGenre);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescription.gridx = 5;
		gbc_lblDescription.gridy = 0;
		frame.getContentPane().add(lblDescription, gbc_lblDescription);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home.main(null);
			}
		});
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.anchor = GridBagConstraints.NORTH;
		gbc_btnSave.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 3;
		gbc_btnSave.gridy = 2;
		frame.getContentPane().add(btnSave, gbc_btnSave);
	}
}
