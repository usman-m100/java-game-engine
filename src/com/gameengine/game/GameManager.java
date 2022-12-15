package com.gameengine.game;

import java.awt.event.KeyEvent;

import com.gameengine.engine.AbstractGame;
import com.gameengine.engine.GameContainer;
import com.gameengine.engine.Renderer;
import com.gameengine.engine.gfx.Image;

public class GameManager extends AbstractGame
{
	
	private Image image;
	
	public GameManager() 
	{
		image = new Image("/car.png");
	}

	@Override
	public void update(GameContainer gc, float dt) {
		
		if(gc.getInput().isKeyDown(KeyEvent.VK_A))
		{
			System.out.println("A was pressed");
		}
	}

	@Override
	public void render(GameContainer gc, Renderer r) {
		
		r.drawImage(image, gc.getInput().getMouseX(), gc.getInput().getMouseY());
		
	}
	
	public static void main(String[] args) {
		GameContainer gc = new GameContainer(new GameManager());
		gc.start();
	}

}
