package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum ProjectStage {
	@SerializedName(value = "1", alternate = "Alpha")
	Alpha(1),

	@SerializedName(value = "2", alternate = "Beta")
	Beta(2),

	@SerializedName(value = "3", alternate = "Deleted")
	Deleted(3),

	@SerializedName(value = "4", alternate = "Inactive")
	Inactive(4),

	@SerializedName(value = "5", alternate = "Mature")
	Mature(5),

	@SerializedName(value = "6", alternate = "Planning")
	Planning(6),

	@SerializedName(value = "7", alternate = "Release")
	Release(7),

	@SerializedName(value = "8", alternate = "Abandoned")
	Abandoned(8),

;

	public final int serialisedValue;

	ProjectStage(int val){
		this.serialisedValue = val;
	}

}