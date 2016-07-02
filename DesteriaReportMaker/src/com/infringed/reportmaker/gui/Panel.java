package com.infringed.reportmaker.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel extends JPanel {
	private JLabel lReportInfo, lReportDetails, lNames, lRealm, lDate, lDetails, lTimeStamps, lEvidence, logo, author; 
	private JTextField names, realm, evidence, date; 
	private JTextArea details, timeStamps;
	private JScrollPane detailsPane, timeStampsPane; 
	private JButton finish;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4485379018159411602L;
	
	public Panel(){
		this.setBackground(new Color(43, 43, 43));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		Font titleFont = new Font("Verdana", Font.BOLD, 16);
		Font labelFont = new Font("Verdana", Font.BOLD, 14);
		Font textFieldFont = new Font("Verdana", Font.PLAIN, 12);
		
		Color textFieldColor = new Color(166, 166, 166);
		Color titleColor = new Color(255, 153, 0);
		Color backgroundColor = new Color(43, 43, 43);
		
		Dimension size = new Dimension(200, 20);
		
		logo = new JLabel("Desteria Reports Maker");
		logo.setFont(new Font("Verdana", Font.BOLD, 20));
		logo.setForeground(new Color(3, 118, 22));
		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(logo); 
		
		author = new JLabel("Developed by Infringed (Inspiration from Sir-Teabag's batch version)");
		author.setFont(new Font("Verdana", Font.ITALIC, 12));
		author.setForeground(Color.YELLOW);
		author.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(author);
		
		lReportInfo = new JLabel("Report Information");
		lReportInfo.setFont(titleFont);
		lReportInfo.setForeground(titleColor);
		lReportInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lReportInfo);
		
		lNames = new JLabel("Name(s) of accused");
		lNames.setFont(labelFont);
		lNames.setForeground(Color.WHITE);
		lNames.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lNames);
		
		names = new JTextField();
		names.setFont(textFieldFont);
		names.setForeground(textFieldColor);
		names.setBackground(backgroundColor);
		names.setAlignmentX(Component.CENTER_ALIGNMENT);
		names.setMaximumSize(size);
		this.add(names);
		
		lRealm = new JLabel("Realm Name");
		lRealm.setFont(labelFont);
		lRealm.setForeground(Color.WHITE);
		lRealm.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lRealm);
		
		realm = new JTextField();
		realm.setFont(textFieldFont);
		realm.setForeground(textFieldColor);
		realm.setBackground(backgroundColor);
		realm.setAlignmentX(Component.CENTER_ALIGNMENT);
		realm.setMaximumSize(size);
		this.add(realm);
		
		lDate = new JLabel("Evidence Date");
		lDate.setFont(labelFont);
		lDate.setForeground(Color.WHITE);
		lDate.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lDate);
		
		date = new JTextField();
		date.setFont(textFieldFont);
		date.setForeground(textFieldColor); 
		date.setBackground(backgroundColor);
		date.setAlignmentX(Component.CENTER_ALIGNMENT);
		date.setMaximumSize(size);
		this.add(date);
		
		lReportDetails = new JLabel("Report Details");
		lReportDetails.setFont(titleFont);
		lReportDetails.setForeground(titleColor);
		lReportDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lReportDetails);
		
		lDetails = new JLabel("Details");
		lDetails.setFont(labelFont);
		lDetails.setForeground(Color.WHITE);
		lDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lDetails);
		
		details = new JTextArea();
		details.setLineWrap(true);
		details.setWrapStyleWord(true);
		details.setFont(textFieldFont);
		details.setForeground(textFieldColor);
		details.setBackground(backgroundColor);
		details.setAlignmentX(Component.CENTER_ALIGNMENT);
		detailsPane = new JScrollPane(details);
		detailsPane.setMaximumSize(new Dimension(400, 55));
		detailsPane.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		this.add(detailsPane); 
		
		lTimeStamps = new JLabel ("Time Stamps");
		lTimeStamps.setFont(labelFont);
		lTimeStamps.setForeground(Color.WHITE);
		lTimeStamps.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lTimeStamps); 
		
		timeStamps = new JTextArea(); 
		timeStamps.setLineWrap(true);
		timeStamps.setWrapStyleWord(true);
		timeStamps.setFont(textFieldFont);
		timeStamps.setForeground(textFieldColor);
		timeStamps.setBackground(backgroundColor);
		timeStamps.setAlignmentX(Component.CENTER_ALIGNMENT);
		timeStampsPane = new JScrollPane(timeStamps); 
		timeStampsPane.setMaximumSize(new Dimension(400, 55));
		timeStampsPane.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		this.add(timeStampsPane); 
		
		lEvidence = new JLabel("Evidence/Link");
		lEvidence.setFont(labelFont);
		lEvidence.setForeground(Color.WHITE);
		lEvidence.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(lEvidence);
		
		evidence = new JTextField();
		evidence.setFont(textFieldFont);
		evidence.setForeground(textFieldColor);
		evidence.setBackground(backgroundColor);
		evidence.setAlignmentX(Component.CENTER_ALIGNMENT);
		evidence.setMaximumSize(size);
		this.add(evidence);
		
		this.add(Box.createRigidArea(new Dimension(0, 50)));
		
		finish = new JButton("Copy report and open report section!"); 
		finish.setFont(new Font("Verdana", Font.BOLD, 20));
		finish.setForeground(titleColor);
		finish.setBackground(backgroundColor);
		finish.setAlignmentX(Component.CENTER_ALIGNMENT);
		finish.addActionListener(buttonClicked);
		this.add(finish);
		
	}
	
	ActionListener buttonClicked = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			//names, realm, evidence, date; 
			//details, timeStamps;
			String report = "";
			report+="[color=#fe9c00][b][i]Step 1: Report Information[/i][/b][/color]";
			report+="\n\n";
			report+="[b][i]Name(s) of accused[/i][/b]: ";
			report+="[color=#6b6b6b]" + names.getText() + "[/color]";
			report+="\n";
			report+="[b][i]Realm name [/b][/i]: ";
			report+="[color=#6b6b6b]" + realm.getText() + "[/color]";
			report+="\n";
			report+="[b][i]Evidence date[/b][/i]: ";
			report+="[color=#6b6b6b]" + date.getText() + "[/color]";
			report+="\n\n";
			report+="[color=#fe9c00][b][i]Step 2: Report Details[/b][/i][/color]";
			report+="\n\n";
			report+="[b][i]Details[/b][/i]:" ;
			report+="\n";
			report+="[color=#6b6b6b]" + details.getText() + "[/color]";
			report+="\n";
			report+="[b][i]Video time-stamp[/b][/i]: ";
			report+="\n";
			report+="[color=#6b6b6b]" + timeStamps.getText() + "[/color]";
			report+="\n";
			report+="[b][i]Evidence[/b][/i]: ";
			report+="\n";
			report+="[url]" + evidence.getText() + "[url]";
			
			
			StringSelection selection = new StringSelection(report);
		    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		    clipboard.setContents(selection, selection);
		    
		    openWebpage("http://desteria.com/community/forums/21/create-thread");
			
		}
	};
	
	public static void openWebpage(String urlString) {
	    try {
	        Desktop.getDesktop().browse(new URL(urlString).toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
