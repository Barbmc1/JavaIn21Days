package JavaIn21Days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alphabet extends JFrame {
	
	public Alphabet() {
		super("Alphabet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(360, 120);
		FlowLayout im = new FlowLayout(FlowLayout.LEFT);
		setLayout(im);
		JButton a = new JButton("Alibi");
		JButton b = new JButton("Burglar");
		JButton c = new JButton("Corpse");
		JButton d = new JButton("Deadbear");
		JButton e = new JButton("Evidance");
		JButton f = new JButton("Fugitive");
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		setVisible(true);
		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.err.println("Couldn't use the system " + "look and feel: " + e);
		
		}
	}

	public static void main(String[] args) {
		Alphabet frame = new Alphabet();
		// TODO Auto-generated method stub

	}

}
