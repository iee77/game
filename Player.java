package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Player {
	
	private int moveSpeed = 10;
	private static int keyLeft = KeyEvent.VK_LEFT;
	private static int keyRight = KeyEvent.VK_RIGHT;
	
	private static boolean left = false;
	private static boolean right = false;
	
	public static Thread keyLyssna;
	
	public static void movement() throws InterruptedException {
		if(left) {
			Game.characterX--;
			Thread.sleep(5);
		}
		if(right) {
			Game.characterX++;
			Thread.sleep(5);
		}
	}
	public static void keyListen() throws InterruptedException {
		keyLyssna = new Thread();
		keyLyssna.start();
		Main.f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == keyLeft) 
					left = true;		
				if (e.getKeyCode() == keyRight) 
					right = true;
			}
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == keyLeft)
					left = false;
				if (e.getKeyCode() == keyRight)
					right = false;
			}
		});
		
		
		
	}
}
