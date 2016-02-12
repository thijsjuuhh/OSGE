package com.thijsjuuhh.OSGE.graphics;

import java.awt.Component;

import javax.swing.JFrame;

public class OSGEWindow {

	private final int WIDTH, HEIGHT;
	public int x = 0, y = 0;
	private JFrame frame;
	private boolean undecorated, resizable;
	private Component location;

	public OSGEWindow(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		frame = new JFrame();
	}

	public OSGEWindow setUndecorated(boolean u) {
		undecorated = u;
		frame.setUndecorated(u);
		return this;
	}

	public boolean getUndecorated() {
		return undecorated;
	}

	public OSGEWindow setResizable(boolean r) {
		resizable = r;
		frame.setResizable(r);
		return this;
	}

	public boolean getResizable() {
		return resizable;
	}

	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}

	public Component getLocation() {
		return location;
	}

	public OSGEWindow setLocation(Component location) {
		this.location = location;
		frame.setLocationRelativeTo(location);
		return this;
	}

	public OSGEWindow setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		frame.setLocation(x, y);
		return this;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public JFrame getFrame() {
		return frame;
	}
	
}
