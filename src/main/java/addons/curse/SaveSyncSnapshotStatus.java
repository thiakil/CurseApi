package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum SaveSyncSnapshotStatus {
	@SerializedName(value = "0", alternate = "Success")
	Success(0),

	@SerializedName(value = "1", alternate = "UnknownException")
	UnknownException(1),

	@SerializedName(value = "2", alternate = "GroupNotFound")
	GroupNotFound(2),

	@SerializedName(value = "3", alternate = "InstanceNotFound")
	InstanceNotFound(3),

;

	public final int serialisedValue;

	SaveSyncSnapshotStatus(int val){
		this.serialisedValue = val;
	}

}