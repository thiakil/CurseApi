package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum GamePlatformType {
	@SerializedName(value = "1", alternate = "Generic")
	Generic(1),

	@SerializedName(value = "2", alternate = "Windows32")
	Windows32(2),

	@SerializedName(value = "3", alternate = "Windows64")
	Windows64(3),

	@SerializedName(value = "4", alternate = "Windows")
	Windows(4),

	@SerializedName(value = "5", alternate = "OSX")
	OSX(5),

;

	public final int serialisedValue;

	GamePlatformType(int val){
		this.serialisedValue = val;
	}

}