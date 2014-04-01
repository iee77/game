package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Game extends JPanel implements Runnable{
	
	private Rectangle Character;
	
	public static int characterX = 375;
	private static int characterY = 275;
	private static int characterHeight = 50;
	private static int characterWidth = 35;
	public static int antPrint;
	
	private boolean running = true;
	private static final long serialVersionUID = 1L;
	
	public Thread Game;

	public void paintComponent(Graphics G) {
		super.paintComponent(G);
			G.setColor(print.Color);
			G.drawRect(print.aX, print.aY, print.aWidth, print.aHeight);
	}
	
	public Game(Panels f) {
		
		setBackground(Color.BLACK);
		
		Game = new Thread(this);
		Game.start();
	}
	
	@Override
	public void run() {
		try {
			Player.keyListen();
			while(running) {
				defineObject Character = new defineObject(characterX, characterY, characterHeight, characterWidth);
				print printCharacter = new print(characterX, characterY, characterHeight, characterWidth, Color.BLUE);
				repaint();
				defineObject Floor = new defineObject(0, Main.height - 1, 1, Main.width);
				print printFloor = new print(0, Main.height - 1, 1, Main.width, Color.RED);
				Player.movement();
				repaint();
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
