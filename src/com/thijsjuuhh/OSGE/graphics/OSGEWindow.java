package com.thijsjuuhh.OSGE.graphics;

import java.awt.Component;

import javax.swing.JFrame;

public class OSGEWindow {

	private final int WIDTH, HEIGHT;
	public int x = 0, y = 0;
	private JFrame frame;
	private boolean visible, undecorated, resizable;
	private Component location;
	private String title;

	public OSGEWindow(int width, int height) {
		this.WIDTH = width;
		this.HEIGHT = height;
		frame = new JFrame();
		frame.setSize(width, height);
	}

	public OSGEWindow setTitle(String title) {
		this.title = title;
		frame.setTitle(title);
		return this;
	}

	public String getTitle() {
		return title;
	}

	public OSGEWindow setVisible(boolean v) {
		visible = v;
		frame.setVisible(v);
		return this;
	}

	public boolean getVisible() {
		return visible;
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

	public OSGEWindow setDefaultCloseOperation(int exitOnClose) {
		frame.setDefaultCloseOperation(exitOnClose);
		return this;
	}

}
