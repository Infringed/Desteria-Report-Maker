package com.infringed.reportmaker.gui;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2504903126267134847L;
	private static final int DP_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2;
	private static final int DP_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2;
	public Panel panel;

	public Frame(){
		
		panel = new Panel();
		
		getContentPane().add(panel);
		
		setBounds(0, 0, DP_WIDTH,DP_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Report Maker"); 
		setVisible(true);
		
	}
	
	public int getWidth(){
		return DP_WIDTH;
	}
	
	public int getHeight(){
		return DP_HEIGHT;
	}
}
