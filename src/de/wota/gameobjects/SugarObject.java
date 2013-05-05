package de.wota.gameobjects;

import de.wota.utility.Vector;


/**
 * Ein Zuckerhaufen. 
 * Sollte für die KI nicht sichtbar sein.
 * @author pascal
 *
 */
public class SugarObject extends GameObject {
	
	private int amount;
	private Sugar sugar;
	
	public SugarObject(int amount, Vector position) {
		super(position);
		this.amount = amount;
		this.sugar = new Sugar(this);
	}
	
	public void createSugar() {
		this.sugar = new Sugar(this);
	}
	
	public Sugar getSugar() {
		return sugar;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void reduceAmount(int reduction) {
		amount = Math.max(amount - reduction, 0);
	}
}