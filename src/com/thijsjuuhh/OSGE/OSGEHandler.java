package com.thijsjuuhh.OSGE;

import com.thijsjuuhh.OSGE.graphics.Graphics;
import com.thijsjuuhh.OSGE.graphics.OSGEWindow;

public class OSGEHandler extends Updater implements Runnable {

	private OSGEWindow w;
	private Graphics g;
	private boolean running = false;
	private Thread t;
	private OSGE osge;

	protected OSGEHandler() {
	}

	public void init(final OSGEWindow w, final Graphics g, final OSGE osge) {
		this.w = w;
		this.g = g;
		this.osge = osge;
		osge.init();
		start();
	}

	private void start() {
		if (running)
			return;
		running = true;
		t = new Thread(this);
		t.start();
	}

	protected void stop() {
		if (!running)
			return;
		running = false;
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public OSGEWindow getWindow() {
		return w;
	}

	public void run() {
		long lastTime = System.nanoTime();
		double delta = 0;
		double ns = 1000000000.0 / ticksPerSecond;
		long timer = System.currentTimeMillis();
		int frames = 0;
		int updates = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1) {
				update();
				updates++;
				delta--;
			}
			g.render();
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + " ups, " + frames + " fps");
				updates = 0;
				frames = 0;
			}

		}

		osge.exit();
	}

	private void update() {
		for (int i = 0; i < getToUpdate().size(); i++)
			getToUpdate().get(i).update();
	}
}
