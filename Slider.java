package JavaIn21Days;

import javax.swing.*;

public class Slider extends JFrame {
	public Slider() {
		super("Slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JSlider pickNum = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
		pickNum.setMajorTickSpacing(10);
		pickNum.setMinorTickSpacing(1);
		pickNum.setPaintTicks(true); 
		pickNum.setPaintLabels(true);
		add(pickNum);
		pack();
		setVisible(true); 
		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
			
		}

	}
	
	

	public static void main(String[] args) {
		Slider frame = new Slider();

	}

}
