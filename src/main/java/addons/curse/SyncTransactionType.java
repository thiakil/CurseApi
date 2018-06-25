package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum SyncTransactionType {
	@SerializedName(value = "0", alternate = "Install")
	Install(0),

	@SerializedName(value = "1", alternate = "Delete")
	Delete(1),

	@SerializedName(value = "2", alternate = "Update")
	Update(2),

;

	public final int serialisedValue;

	SyncTransactionType(int val){
		this.serialisedValue = val;
	}

}