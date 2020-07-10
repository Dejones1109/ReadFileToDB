package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import Controller.ReadFileController;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ReadFileView extends JFrame {

	private JPanel contentPane;
	private JTextField URL;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;
	private ReadFileController controller;
	// gọi controller
	
	public ReadFileView(ReadFileController controller) {
		this.controller = controller;
	}

	

	/**
	 * Create the frame.
	 */
	public ReadFileView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel_1 = new JLabel("Tool Read File To DB");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("File");
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		URL = new JTextField();
		GridBagConstraints gbc_URL = new GridBagConstraints();
		gbc_URL.fill = GridBagConstraints.HORIZONTAL;
		gbc_URL.gridwidth = 2;
		gbc_URL.insets = new Insets(0, 0, 5, 5);
		gbc_URL.anchor = GridBagConstraints.NORTH;
		gbc_URL.gridx = 2;
		gbc_URL.gridy = 1;
		contentPane.add(URL, gbc_URL);
		URL.setColumns(10);
		
		JButton Choose = new JButton("Chọn");
		Choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Upload File to my computer
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

				int returnValue = jfc.showOpenDialog(null);
				
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();	
					String file =selectedFile.getAbsolutePath();
					URL.setText(file);
					textArea.setText("Nhập File thành công :"+file);
					
					controller = new ReadFileController();
					try {
						controller.ReadFile(file);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

			}
		});
		GridBagConstraints gbc_Choose = new GridBagConstraints();
		gbc_Choose.insets = new Insets(0, 0, 5, 0);
		gbc_Choose.gridx = 4;
		gbc_Choose.gridy = 1;
		contentPane.add(Choose, gbc_Choose);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 0, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 2;
		contentPane.add(textArea, gbc_textArea);
	}

}
