package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum GameDetectionHintType {
	@SerializedName(value = "1", alternate = "Registry")
	Registry(1),

	@SerializedName(value = "2", alternate = "FilePath")
	FilePath(2),

;

	public final int serialisedValue;

	GameDetectionHintType(int val){
		this.serialisedValue = val;
	}

}