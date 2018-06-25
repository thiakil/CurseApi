package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum GameDetectionHintOption {
	@SerializedName(value = "0", alternate = "None")
	None(0),

	@SerializedName(value = "1", alternate = "IncludeSubFolders")
	IncludeSubFolders(1),

	@SerializedName(value = "2", alternate = "FolderOnly")
	FolderOnly(2),

;

	public final int serialisedValue;

	GameDetectionHintOption(int val){
		this.serialisedValue = val;
	}

}