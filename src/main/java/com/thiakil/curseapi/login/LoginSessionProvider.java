package com.thiakil.curseapi.login;

public interface LoginSessionProvider {
	LoginSession getLoginSession();
	long getTimestamp();
	boolean isSuccess();
}
