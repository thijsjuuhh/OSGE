package com.thijsjuuhh.OSGE.graphics;

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

	static Graphics2D getInstance() {
		if(instance == null) throw new NullPointerException("The graphics object has not been created yet!");
		return instance;
	}

}
