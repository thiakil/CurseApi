package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum FileStatus {
	@SerializedName(value = "1", alternate = "Normal")
	Normal(1),

	@SerializedName(value = "2", alternate = "SemiNormal")
	SemiNormal(2),

	@SerializedName(value = "3", alternate = "Reported")
	Reported(3),

	@SerializedName(value = "4", alternate = "Malformed")
	Malformed(4),

	@SerializedName(value = "5", alternate = "Locked")
	Locked(5),

	@SerializedName(value = "6", alternate = "InvalidLayout")
	InvalidLayout(6),

	@SerializedName(value = "7", alternate = "Hidden")
	Hidden(7),

	@SerializedName(value = "8", alternate = "NeedsApproval")
	NeedsApproval(8),

	@SerializedName(value = "9", alternate = "Deleted")
	Deleted(9),

	@SerializedName(value = "10", alternate = "UnderReview")
	UnderReview(10),

	@SerializedName(value = "11", alternate = "MalwareDetected")
	MalwareDetected(11),

	@SerializedName(value = "12", alternate = "WaitingOnProject")
	WaitingOnProject(12),

	@SerializedName(value = "13", alternate = "ClientOnly")
	ClientOnly(13),

;

	public final int serialisedValue;

	FileStatus(int val){
		this.serialisedValue = val;
	}

}