package addons.curse;

import com.google.gson.annotations.SerializedName;

public enum ModLoaderInstallMethod {
	@SerializedName(value = "1", alternate = "ForgeInstaller")
	ForgeInstaller(1),

	@SerializedName(value = "2", alternate = "ForgeJarInstall")
	ForgeJarInstall(2),

;

	public final int serialisedValue;

	ModLoaderInstallMethod(int val){
		this.serialisedValue = val;
	}

}