package JavaIn21Days;
import javax.swing.*;

public class IconFrame extends JFrame {
	public IconFrame() {
		super("Icon Frame");
		setSize(500, 170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		//create icons
		ImageIcon loadIcon = new ImageIcon("load.gif");
		ImageIcon saveIcon = new ImageIcon("save.gif");
		ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
		ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
		//create buttons
		JButton load = new JButton("Load", loadIcon);
		JButton save = new JButton("New", saveIcon);
		JButton subscribe = new JButton("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		//add buttons to panel
		panel.add(load);
		panel.add(save);
		panel.add(subscribe);
		panel.add(unsubscribe);
		//add panel to frame
		add(panel);
		setVisible(true);
				
	}

	public static void main(String[] args) {
		IconFrame ike = new IconFrame();

	}

}
