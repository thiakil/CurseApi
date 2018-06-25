package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum ModLoaderType {
	@SerializedName(value = "0", alternate = "Any")
	Any(0),

	@SerializedName(value = "1", alternate = "Forge")
	Forge(1),

	@SerializedName(value = "2", alternate = "Cauldron")
	Cauldron(2),

	@SerializedName(value = "3", alternate = "LiteLoader")
	LiteLoader(3),

;

	public final int serialisedValue;

	ModLoaderType(int val){
		this.serialisedValue = val;
	}

}