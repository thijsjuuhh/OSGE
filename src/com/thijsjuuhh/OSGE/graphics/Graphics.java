package com.thijsjuuhh.OSGE.graphics;

import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Graphics extends Renderer {

	private BufferedImage img;
	protected int[] pixels;
	private OSGEWindow w;

	protected Graphics2D g2d;
	protected Graphics3D g3d;
	
	public enum TYPE {
		TYPE_2D, TYPE_3D;
	}

	protected final int WIDTH, HEIGHT;

	private TYPE type;

	protected Graphics(int width, int height, final OSGEWindow w, TYPE type) {
		this.type = type;
		this.WIDTH = width;
		this.HEIGHT = height;
		this.w = w;
		img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
	}

	public void render() {
		BufferStrategy bs = w.getFrame().getBufferStrategy();
		if (bs == null) {
			w.getFrame().createBufferStrategy(3);
			return;
		}

		for (int i = 0; i < getToRender().size(); i++)
			getToRender().get(i).render(g2d);

		java.awt.Graphics g = bs.getDrawGraphics();
		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
		g.dispose();
		bs.show();

	}

	public TYPE getType() {
		return type;
	}

	protected boolean inbounds(int x, int y) {
		if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT)
			return false;
		return true;
	}

}
