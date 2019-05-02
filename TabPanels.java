package JavaIn21Days;

import java.awt.*;
import javax.swing.*;

public class TabPanels extends JFrame {
	
	public TabPanels() {
	super("Tabbed Panels");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLookAndFeel();
	setSize(400, 218);
	JPanel mainSetting = new JPanel();
	JPanel advancedSettings = new JPanel();
	JPanel privacySettings = new JPanel();
	JPanel emailSettings = new JPanel();
	JPanel securitySettings = new JPanel();
	JTabbedPane tabs = new JTabbedPane();
	tabs.addTab("Main",  mainSetting);
	tabs.addTab("Advanced", advancedSettings);
	tabs.addTab("Privacy",  privacySettings);
	tabs.addTab("E-mail",  emailSettings);
	tabs.addTab("Security",  securitySettings);
	add(tabs);
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
		TabPanels frame = new TabPanels();

	}

}
