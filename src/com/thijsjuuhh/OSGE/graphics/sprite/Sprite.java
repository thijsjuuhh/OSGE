package com.thijsjuuhh.OSGE.graphics.sprite;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

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

	private Sprite(int nw, int nh, Sprite s) {
		width = nw;
		height = nh;
		pixels = new int[nw * nh];
		BufferedImage img = new BufferedImage(nw, nh, BufferedImage.TYPE_INT_RGB);
		BufferedImage old = new BufferedImage(s.getWidth(), s.getHeight(), BufferedImage.TYPE_INT_RGB);
		old.setRGB(0, 0, s.getWidth(), s.getHeight(), s.pixels, 0, s.getWidth());
		Graphics g = img.getGraphics();
		g.drawImage(old.getScaledInstance(nw, nh, Image.SCALE_DEFAULT), 0, 0, null);
		g.dispose();
		
		img.getRGB(0, 0, nw, nh, pixels, 0, nw);
	}

	public Sprite getScaledInstance(int nw, int nh) {
		return new Sprite(nw, nh, this);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
