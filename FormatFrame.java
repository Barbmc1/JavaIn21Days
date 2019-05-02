package JavaIn21Days;
import javax.swing.*;


public class FormatFrame extends JFrame {
	JRadioButton[] teams = new JRadioButton[4];
	
	public FormatFrame() {
		super("Choose an Output Frame");
		setSize(320, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teams[0] = new JRadioButton("Atom");
		teams[1] = new JRadioButton("RSS 0.92");
		teams[2] = new JRadioButton("RSS 1.0");
		teams[2] = new JRadioButton("RSS2.0", true);
		
		JPanel panel = new JPanel();
		 JLabel chooseLabel = new JLabel("Choose an output format for syndicated news item.");
		 panel.add(chooseLabel);
		 ButtonGroup group = new ButtonGroup();
		 for (JRadioButton team : teams) {
			 group.add(team);
			 panel.add(team);
		 }
		 add(panel);
		 setVisible(true);
		 
	}
	
	
	public static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
			
		}

	}
	

	public static void main(String[] args) {
		FormatFrame.setLookAndFeel();
		FormatFrame ff = new FormatFrame();

	}

}
