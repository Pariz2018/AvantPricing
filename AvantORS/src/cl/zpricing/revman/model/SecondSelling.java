package cl.zpricing.revman.model;

import java.io.Serializable;

public class SecondSelling implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sessionId;
	private int orden;
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
}
