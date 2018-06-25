package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum SaveUserBackupStatus {
	@SerializedName(value = "0", alternate = "Success")
	Success(0),

	@SerializedName(value = "1", alternate = "Failure")
	Failure(1),

	@SerializedName(value = "2", alternate = "UnknownException")
	UnknownException(2),

	@SerializedName(value = "3", alternate = "NoMatchingFiles")
	NoMatchingFiles(3),

	@SerializedName(value = "4", alternate = "NoChangeDetected")
	NoChangeDetected(4),

	@SerializedName(value = "5", alternate = "FingerprintMismatch")
	FingerprintMismatch(5),

;

	public final int serialisedValue;

	SaveUserBackupStatus(int val){
		this.serialisedValue = val;
	}

}