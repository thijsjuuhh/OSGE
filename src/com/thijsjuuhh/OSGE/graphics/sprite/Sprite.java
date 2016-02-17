package com.thijsjuuhh.OSGE.graphics.sprite;

public class Sprite {

	private final int width, height;
	public int[] pixels;

	public Sprite(int width, int height, int x, int y, SpriteSheet s) {
		this.width = width;
		this.height = height;

		pixels = new int[width * height];

		for (int y0 = 0; y0 < height; y0++)
			for (int x0 = 0; x0 < width; x0++)
				pixels[x0 + y0 * width] = s.pixels[(x0 + x) + (y0 + y) * s.getWidth()];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
