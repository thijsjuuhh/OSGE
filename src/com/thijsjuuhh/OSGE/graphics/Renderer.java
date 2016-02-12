package com.thijsjuuhh.OSGE.graphics;

import java.util.LinkedList;

public abstract class Renderer {

	private static LinkedList<Render> render = new LinkedList<Render>();

	public static void add(Render toAdd) {
		render.add(toAdd);
	}

	protected static LinkedList<Render> getToRender() {
		return render;
	}

}
