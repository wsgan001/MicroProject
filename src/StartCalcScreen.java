import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.border.LineBorder;

public class StartCalcScreen extends JPanel {
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public StartCalcScreen(ActionListener moveOn, ActionListener home) {
		setBackground(new Color(147, 112, 219));
		setSize(700, 700);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{150, 30, 100, 240, 180};
		gridBagLayout.rowHeights = new int[]{90, 90, 30, 35, 35, 35, 30, 50, 212, 50};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JTextPane txtpnMakeSureThat = new JTextPane();
		StyledDocument doc = txtpnMakeSureThat.getStyledDocument();
		SimpleAttributeSet attribs = new SimpleAttributeSet();  
		StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontFamily(attribs, "Lucida Grande");
		StyleConstants.setFontSize(attribs, 20);
		doc.setParagraphAttributes(0, doc.getLength(), attribs,true);
		
		txtpnMakeSureThat.setEditable(false);
		txtpnMakeSureThat.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtpnMakeSureThat.setBackground(new Color(147, 112, 219));
		txtpnMakeSureThat.setText("Make sure that all \nentered values are \nnumbers");
		GridBagConstraints gbc_txtpnMakeSureThat = new GridBagConstraints();
		gbc_txtpnMakeSureThat.fill = GridBagConstraints.VERTICAL;
		gbc_txtpnMakeSureThat.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnMakeSureThat.gridx = 3;
		gbc_txtpnMakeSureThat.gridy = 1;
		add(txtpnMakeSureThat, gbc_txtpnMakeSureThat);
		
		
		
		JLabel lblQuestion = new JLabel("Units of labor:");
		GridBagConstraints gbc_lblQuestion = new GridBagConstraints();
		gbc_lblQuestion.anchor = GridBagConstraints.EAST;
		gbc_lblQuestion.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestion.gridx = 2;
		gbc_lblQuestion.gridy = 3;
		add(lblQuestion, gbc_lblQuestion);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblQuestion_1 = new JLabel("Price of labor:");
		GridBagConstraints gbc_lblQuestion_1 = new GridBagConstraints();
		gbc_lblQuestion_1.anchor = GridBagConstraints.EAST;
		gbc_lblQuestion_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestion_1.gridx = 2;
		gbc_lblQuestion_1.gridy = 4;
		add(lblQuestion_1, gbc_lblQuestion_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQuestion_2 = new JLabel("Wages:");
		GridBagConstraints gbc_lblQuestion_2 = new GridBagConstraints();
		gbc_lblQuestion_2.anchor = GridBagConstraints.EAST;
		gbc_lblQuestion_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestion_2.gridx = 2;
		gbc_lblQuestion_2.gridy = 5;
		add(lblQuestion_2, gbc_lblQuestion_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 5;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 7;
		add(panel_1, gbc_panel_1);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBorderPainted(false);
		btnCalculate.setBounds(0, 0, 235, 45);
		panel_1.add(btnCalculate);
		btnCalculate.addActionListener(moveOn);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 150, 50);
		panel.setLayout(null);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 9;
		add(panel, gbc_panel);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBounds(0, 0, 145, 50);
		btnHome.setAlignmentY(Component.TOP_ALIGNMENT);
		btnHome.setPreferredSize(new Dimension(146, 56));
		btnHome.setContentAreaFilled(false);
		btnHome.setBorderPainted(false);
		panel.add(btnHome);
		btnHome.addActionListener(home);
	}

}