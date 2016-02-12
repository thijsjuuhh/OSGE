package com.thijsjuuhh.OSGE;


import com.thijsjuuhh.OSGE.graphics.Graphics;
import com.thijsjuuhh.OSGE.graphics.OSGEWindow;

public class OSGEHandler {

	private OSGEWindow w;
	private Graphics g;
	
	protected OSGEHandler() {
	}
	
	public void init(OSGEWindow w, Graphics g) {
		this.w = w;
		this.g = g;
	}
	
	public OSGEWindow getWindow() {
		return w;
	}
	
	public Graphics getGraphics() {
		return g;
	}
	
}
