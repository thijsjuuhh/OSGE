package com.thijsjuuhh.OSGE.graphics;

import com.thijsjuuhh.OSGE.graphics.sprite.Sprite;
import com.thijsjuuhh.OSGE.graphics.sprite.SpriteSheet;

public class Graphics2D extends Graphics {

	private static Graphics2D instance;

	public Graphics2D(int width, int height, OSGEWindow w) {
		super(width, height, w, TYPE.TYPE_2D);
		g2d = this;
		instance = this;
	}

	public void fillSquare(int startX, int startY, int endX, int endY, int col) {
		for (int y = startY; y < startY + endY; y++)
			for (int x = startX; x < startX + endX; x++)
				if (!inbounds(x, y))
					continue;
				else
					pixels[x + y * WIDTH] = col;

	}

	public void clear(int col) {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = col;
		}
	}
	
	public void renderSprite(int x, int y, Sprite s) {
		for (int y0 = 0; y0 < s.getHeight(); y0++) {
			int yPix = y + y0;
			for (int x0 = 0; x0 < s.getWidth(); x0++) {
				int xPix = x + x0;
				if (!inbounds(xPix, yPix))
					continue;
				else
					pixels[xPix + yPix * WIDTH] = s.pixels[x0 + y0 * s.getWidth()];
			}
		}
	}

	public void renderSprite(int x, int y, SpriteSheet s) {
		for (int y0 = 0; y0 < s.getHeight(); y0++) {
			int yPix = y + y0;
			for (int x0 = 0; x0 < s.getWidth(); x0++) {
				int xPix = x + x0;
				if (!inbounds(xPix, yPix))
					continue;
				else
					pixels[xPix + yPix * WIDTH] = s.pixels[x0 + y0 * s.getWidth()];

			}
		}
	}

	static Graphics2D getInstance() {
		if (instance == null)
			throw new NullPointerException("The graphics object has not been created yet!");
		return instance;
	}

}
