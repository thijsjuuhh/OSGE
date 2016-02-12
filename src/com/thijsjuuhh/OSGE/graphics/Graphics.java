package com.thijsjuuhh.OSGE.graphics;

public class Graphics {

	public enum TYPE {
		TYPE_2D, TYPE_3D;
	}

	protected final int WIDTH, HEIGHT;

	private TYPE type;

	protected Graphics(int width, int height, TYPE type) {
		this.type = type;
		this.WIDTH = width;
		this.HEIGHT = height;
	}

	public TYPE getType() {
		return type;
	}
	
}
