package com.thijsjuuhh.OSGE.graphics.sprite;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	public int[] pixels;
	private int width, height;
	
	public SpriteSheet(String path) {
		try {
			BufferedImage i = ImageIO.read(SpriteSheet.class.getResource(path));
			width = i.getWidth();
			height = i.getHeight();
			pixels = new int[width*height];
			i.getRGB(0, 0, width, height, pixels, 0, width);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
}
