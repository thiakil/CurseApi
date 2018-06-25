package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum SupportedClientConfiguration {
	@SerializedName(value = "1", alternate = "Debug")
	Debug(1),

	@SerializedName(value = "2", alternate = "Beta")
	Beta(2),

	@SerializedName(value = "3", alternate = "Release")
	Release(3),

;

	public final int serialisedValue;

	SupportedClientConfiguration(int val){
		this.serialisedValue = val;
	}

}