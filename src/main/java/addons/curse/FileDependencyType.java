package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum FileDependencyType {
	@SerializedName(value = "1", alternate = "Required")
	Required(1),

	@SerializedName(value = "2", alternate = "Optional")
	Optional(2),

	@SerializedName(value = "3", alternate = "Embedded")
	Embedded(3),

;

	public final int serialisedValue;

	FileDependencyType(int val){
		this.serialisedValue = val;
	}

}