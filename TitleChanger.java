package JavaIn21Days;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;

import java.awt.*;

public class TitleChanger extends JFrame implements ActionListener {
	JButton b1;
	JButton b2;
	
	public TitleChanger() {
		super("Title Bar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("Rosencrantz");
		b2 = new JButton("Guildenstern");
		b1.addActionListener(this);
		b2.addActionListener(this);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		add(b2);
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (source == b1) {
			setTitle("Rosencrantz");
		}else if (source == b2) {
			setTitle("Guildenstern");
		}
		repaint();

	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception exc) {
				System.err.println("Couldn't use the system look and feel: " + exc);
			}
	}

	public static void main(String[] args) {
		TitleChanger frame = new TitleChanger();
		// TODO Auto-generated method stub

	}

}
