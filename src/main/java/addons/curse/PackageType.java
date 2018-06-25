package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum PackageType {
	@SerializedName(value = "1", alternate = "Folder")
	Folder(1),

	@SerializedName(value = "2", alternate = "Ctoc")
	Ctoc(2),

	@SerializedName(value = "3", alternate = "SingleFile")
	SingleFile(3),

	@SerializedName(value = "4", alternate = "Cmod2")
	Cmod2(4),

	@SerializedName(value = "5", alternate = "ModPack")
	ModPack(5),

	@SerializedName(value = "6", alternate = "Mod")
	Mod(6),

;

	public final int serialisedValue;

	PackageType(int val){
		this.serialisedValue = val;
	}

}