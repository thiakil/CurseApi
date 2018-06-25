package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum CreateSyncGroupStatus {
	@SerializedName(value = "0", alternate = "Success")
	Success(0),

	@SerializedName(value = "1", alternate = "UnknownException")
	UnknownException(1),

	@SerializedName(value = "2", alternate = "GroupAlreadyExists")
	GroupAlreadyExists(2),

;

	public final int serialisedValue;

	CreateSyncGroupStatus(int val){
		this.serialisedValue = val;
	}

}