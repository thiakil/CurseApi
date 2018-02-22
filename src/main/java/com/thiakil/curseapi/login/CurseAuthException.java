package com.thiakil.curseapi.login;

public class CurseAuthException extends Exception {
	public CurseAuthException(Throwable t){
		super(t);
	}

	public CurseAuthException(String reason){
		super(reason);
	}
}
