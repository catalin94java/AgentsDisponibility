package disponibilitateagenti;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register {

	private JFrame frmRegister;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private JTextField textFieldUserName;
	private JTextField textFieldCampaign;
	private JLabel lblPassword;
	private JLabel lblRetypePassword;
	private JLabel lblUsername;
	private JLabel lblCampaign;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldRetype;
	private JButton btnCancel;
	private JButton btnRegister;
	private JLabel lblNewLabel;
	
	Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				Register window = new Register();
				window.frmRegister.setVisible(true);
				
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
		connection = MySqlConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	
	public void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.setBounds(100, 100, 335, 370);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmRegister.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.anchor = GridBagConstraints.WEST;
		gbc_lblFirstName.insets = new Insets(5, 5, 5, 5);
		gbc_lblFirstName.gridx = 1;
		gbc_lblFirstName.gridy = 2;
		frmRegister.getContentPane().add(lblFirstName, gbc_lblFirstName);
		
		textFieldFirstName = new JTextField();
		GridBagConstraints gbc_textFieldFirstName = new GridBagConstraints();
		gbc_textFieldFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFirstName.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldFirstName.gridx = 3;
		gbc_textFieldFirstName.gridy = 2;
		frmRegister.getContentPane().add(textFieldFirstName, gbc_textFieldFirstName);
		textFieldFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.WEST;
		gbc_lblLastName.insets = new Insets(5, 5, 5, 5);
		gbc_lblLastName.gridx = 1;
		gbc_lblLastName.gridy = 3;
		frmRegister.getContentPane().add(lblLastName, gbc_lblLastName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		GridBagConstraints gbc_textFieldLastName = new GridBagConstraints();
		gbc_textFieldLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldLastName.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldLastName.gridx = 3;
		gbc_textFieldLastName.gridy = 3;
		frmRegister.getContentPane().add(textFieldLastName, gbc_textFieldLastName);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.insets = new Insets(5, 5, 5, 5);
		gbc_lblUsername.gridx = 1;
		gbc_lblUsername.gridy = 4;
		frmRegister.getContentPane().add(lblUsername, gbc_lblUsername);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setColumns(10);
		GridBagConstraints gbc_textFieldUserName = new GridBagConstraints();
		gbc_textFieldUserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUserName.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldUserName.gridx = 3;
		gbc_textFieldUserName.gridy = 4;
		frmRegister.getContentPane().add(textFieldUserName, gbc_textFieldUserName);
		
		lblCampaign = new JLabel("Campaign");
		lblCampaign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblCampaign = new GridBagConstraints();
		gbc_lblCampaign.anchor = GridBagConstraints.WEST;
		gbc_lblCampaign.insets = new Insets(5, 5, 5, 5);
		gbc_lblCampaign.gridx = 1;
		gbc_lblCampaign.gridy = 5;
		frmRegister.getContentPane().add(lblCampaign, gbc_lblCampaign);
		
		textFieldCampaign = new JTextField();
		textFieldCampaign.setColumns(10);
		GridBagConstraints gbc_textFieldCampaign = new GridBagConstraints();
		gbc_textFieldCampaign.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCampaign.insets = new Insets(5, 5, 5, 5);
		gbc_textFieldCampaign.gridx = 3;
		gbc_textFieldCampaign.gridy = 5;
		frmRegister.getContentPane().add(textFieldCampaign, gbc_textFieldCampaign);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.insets = new Insets(5, 5, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 6;
		frmRegister.getContentPane().add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setSize(new Dimension(6, 20));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(5, 5, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 6;
		frmRegister.getContentPane().add(passwordField, gbc_passwordField);
		
		lblRetypePassword = new JLabel("Retype Password");
		lblRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblRetypePassword = new GridBagConstraints();
		gbc_lblRetypePassword.anchor = GridBagConstraints.WEST;
		gbc_lblRetypePassword.insets = new Insets(5, 5, 5, 5);
		gbc_lblRetypePassword.gridx = 1;
		gbc_lblRetypePassword.gridy = 7;
		frmRegister.getContentPane().add(lblRetypePassword, gbc_lblRetypePassword);
		
		passwordFieldRetype = new JPasswordField();
		GridBagConstraints gbc_passwordFieldRetype = new GridBagConstraints();
		gbc_passwordFieldRetype.insets = new Insets(5, 5, 5, 5);
		gbc_passwordFieldRetype.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldRetype.gridx = 3;
		gbc_passwordFieldRetype.gridy = 7;
		frmRegister.getContentPane().add(passwordFieldRetype, gbc_passwordFieldRetype);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegister.dispose();
			}
		});
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.anchor = GridBagConstraints.WEST;
		gbc_btnCancel.insets = new Insets(5, 5, 5, 5);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 9;
		frmRegister.getContentPane().add(btnCancel, gbc_btnCancel);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fnC = textFieldFirstName.getText();
				String lnC = textFieldLastName.getText();
				String unC = textFieldUserName.getText();
				String cmpC = textFieldCampaign.getText();
				String pass = String.valueOf(passwordField.getPassword());
				
				
				
				try {
					String md5Hash = HashGeneratorUtils.generateMD5(pass);
					
					String queryAddUser = "INSERT INTO CONTURI (FIRSTNAME,LASTNAME,USERNAME,CAMPAIGN,PASSWORD) VALUES (?, ?, ?, ?, ?) ; ";

					
					PreparedStatement pst = connection.prepareStatement(queryAddUser);

		
					pst.setString(1, fnC);
					pst.setString(2, lnC);
					pst.setString(3, unC);
					pst.setString(4, cmpC);	
					pst.setString(5, md5Hash);
					
					pst.execute();

					
					System.out.println("user added");
					
					
				}catch(Exception ex){
					
					ex.printStackTrace();
				}
				
				
			}
		});
		GridBagConstraints gbc_btnRegister = new GridBagConstraints();
		gbc_btnRegister.insets = new Insets(5, 5, 5, 5);
		gbc_btnRegister.anchor = GridBagConstraints.WEST;
		gbc_btnRegister.gridx = 3;
		gbc_btnRegister.gridy = 9;
		frmRegister.getContentPane().add(btnRegister, gbc_btnRegister);
		
		lblNewLabel = new JLabel(" Go to Login");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login.main(new String[0]);
				
				frmRegister.dispose();
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(5, 5, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 10;
		frmRegister.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		
		
	}
}
