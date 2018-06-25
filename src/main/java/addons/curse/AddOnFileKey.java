package addons.curse;

public class AddOnFileKey {
	public int addonId;
	public int fileId;

	public AddOnFileKey(){}

	public AddOnFileKey(int addonId, int fileId){
		this.addonId = addonId;
		this.fileId = fileId;
	}
}