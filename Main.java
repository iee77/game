package game;

import javax.swing.*;

public class Main {
	public static Panels f;
	public static int width = 800;
	public static int height = 600;
	public static String title = "Filips Amazing Spel 1.0";
	
	public void setTitle(String Title) {
		title = Title;
	}
	
	public static void main(String[] args) {
		f = new Panels();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(width, height);
		f.setTitle(title);
		f.setLocationRelativeTo(null);
	}

}
