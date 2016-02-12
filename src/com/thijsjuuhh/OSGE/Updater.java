package com.thijsjuuhh.OSGE;

import java.util.LinkedList;

public abstract class Updater {

	private static LinkedList<Update> update = new LinkedList<Update>();
	protected static double ticksPerSecond = 20;
	
	public static void add(Update toAdd) {
		update.add(toAdd);
	}

	public static void setTicksPerSecond(double ticksPerSecond) {
		Updater.ticksPerSecond = ticksPerSecond;
	}
	
	protected static LinkedList<Update> getToUpdate() {
		return update;
	}

}
