package AkkaProject;

import java.io.Serializable;

public class MessageToActor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @author soufiane
	 * 
	 *  Num=>L'identifiant de l'acteur
	 *  message => Le message envoyé
	 * 
	 */
	
	public int num;
	public String message;


	public MessageToActor(int num, String message) {
		super();
		this.num = num;
		this.message = message;
	}

	/**
	 * 
	 * @return num (int)
	 */
	public int getNum() {
		return num;
	}

	/**
	 * 
	 * @param num (int)
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * 
	 * @return message (String)
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message(String)
	 */
	public void setMessage(String message) {
		this.message = message;
	}



}
