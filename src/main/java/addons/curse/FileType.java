package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum FileType {
	@SerializedName(value = "1", alternate = "Release")
	Release(1),

	@SerializedName(value = "2", alternate = "Beta")
	Beta(2),

	@SerializedName(value = "3", alternate = "Alpha")
	Alpha(3),

;

	public final int serialisedValue;

	FileType(int val){
		this.serialisedValue = val;
	}

}