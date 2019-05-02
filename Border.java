package JavaIn21Days;

import java.awt.*;
import javax.swing.*;

public class Border extends JFrame {
	
	public Border() {
		super("Border");
		setSize(240,280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setLayout(new BorderLayout());
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
		setVisible(true);
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
		Border frame = new Border();
		// TODO Auto-generated method stub

	}

}
