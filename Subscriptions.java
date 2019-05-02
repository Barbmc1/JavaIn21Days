package JavaIn21Days;
import javax.swing.*;

public class Subscriptions extends JFrame {
	String[] subs = { "0xDECAFBAD", "Cafe au Lait", "Hack the Planet", "Ideoplex", "Inessential", "Intertwing", "Markpasc", "Postneo", "RC3", "Workbench" };
	JList  subList = new JList(subs);
	
	public Subscriptions() {
		super("Subscriptions");
		setSize(275, 335);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel subLabel = new JLabel("RSS Subscritions: ");
		JScrollPane scroller = new JScrollPane(subList);
		panel.add(scroller);
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
		Subscriptions.setLookAndFeel();
		Subscriptions app = new Subscriptions();

	}

}
