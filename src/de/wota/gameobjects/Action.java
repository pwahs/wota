package de.wota.gameobjects;

import de.wota.utility.Vector;

/**
 * An ant's planned action.
 * Contains a message, an AntObject to be attacked and a movement vector.
 * 
 * @author pascal
 *
 */
public class Action {
	public static final int NO_MESSAGE = -1;
	public int messageContent;
	public Ant attackTarget;
	/** sugarSource where sugar should be picked up */
	public Sugar sugarTarget;
	
	public Vector movement;
	// See comment for setMessageObject.
	private MessageObject messageObject;

	/** do nothing */
	public Action() {
		messageContent = NO_MESSAGE;
		attackTarget = null;
		sugarTarget = null;
		movement = new Vector(0,0); 
	}
	
	/**
	 * In contrast to other setters, this setter is not intended to be called by methods callable
	 * from AntAI.tick. Instead, it is intended to be called afterwards using messageContent.
	 * @param messageObject
	 */
	public void setMessageObject(MessageObject messageObject) {
		this.messageObject = messageObject;
	}
	
	public MessageObject getMessageObject() {
		return messageObject;
	}
}
