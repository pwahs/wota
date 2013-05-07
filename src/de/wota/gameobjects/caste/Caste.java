package de.wota.gameobjects.caste;

/**
 * Contains the constants of different castes
 */
public enum Caste {
	Gatherer(
			100, // ANT_HEALTH_INIT
			1, 	// ANT_SPEED
			5,	// ANT_ATTACK
			10	// MAX_SUGAR_CARRY
	),

	Soldier(
			100, // ANT_HEALTH_INIT
			0.5, 	// ANT_SPEED
			10,	// ANT_ATTACK
			5	// MAX_SUGAR_CARRY
	),

	Queen(
			1000, // ANT_HEALTH_INIT
			0, 	// ANT_SPEED
			0,	// ANT_ATTACK
			0	// MAX_SUGAR_CARRY
	);
	
	public final double ANT_HEALTH_INIT;
	public final double ANT_SPEED;
	/** Angriffspunkte */
	public final double ANT_ATTACK;
	public final int MAX_SUGAR_CARRY;	
	
	private Caste(double ANT_HEALTH_INIT, double ANT_SPEED, double ANT_ATTACK, int MAX_SUGAR_CARRY) {
		this.ANT_HEALTH_INIT = ANT_HEALTH_INIT;
		this.ANT_SPEED = ANT_SPEED;
		this.ANT_ATTACK = ANT_ATTACK;
		this.MAX_SUGAR_CARRY = MAX_SUGAR_CARRY;
	}
}