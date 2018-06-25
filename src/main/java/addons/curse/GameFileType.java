package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum GameFileType {
	@SerializedName(value = "1", alternate = "Generic")
	Generic(1),

	@SerializedName(value = "2", alternate = "Game")
	Game(2),

	@SerializedName(value = "3", alternate = "Launcher")
	Launcher(3),

	@SerializedName(value = "4", alternate = "ProfilerLockCheck")
	ProfilerLockCheck(4),

;

	public final int serialisedValue;

	GameFileType(int val){
		this.serialisedValue = val;
	}

}