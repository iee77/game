package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class print extends JPanel{
	
	static int aX = 0;
	static int aY = 0;
	static int aHeight = 0;
	static int aWidth = 0;
	static Color Color;
	
	public print(int x, int y, int Height, int Width, Color color) {
		aX = x;
		aY = y;
		aHeight = Height;
		aWidth = Width;
		Color = color;
		repaint();
	}
}
