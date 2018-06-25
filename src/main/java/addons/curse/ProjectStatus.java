package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum ProjectStatus {
	@SerializedName(value = "1", alternate = "Normal")
	Normal(1),

	@SerializedName(value = "2", alternate = "Hidden")
	Hidden(2),

	@SerializedName(value = "3", alternate = "Deleted")
	Deleted(3),

;

	public final int serialisedValue;

	ProjectStatus(int val){
		this.serialisedValue = val;
	}

}