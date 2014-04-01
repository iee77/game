package game;

import java.awt.*;

import javax.swing.*;

public class Panels extends JFrame {
	public Game panel;
	public Game d = new Game(this);
	
	public Panels() {
		this.setLayout(new BorderLayout());
		panel = new Game(this);
		setLayout(new GridLayout(1, 1, 0, 0));
		add(panel, BorderLayout.CENTER);
		
	}
	
}
