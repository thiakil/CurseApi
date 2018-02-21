import addons.curse.AddOnFile;
import addons.curse.FingerprintMatchResult;
import com.curse.addonservice.GetAllFilesForAddOn;
import com.curse.addonservice.GetAllFilesForAddOnResponse;
import com.thiakil.curseapi.AddOnService;
import com.thiakil.curseapi.AddOnServiceStub;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * Created by Thiakil on 19/02/2018.
 */
public class test {
	public static void main(String[] args) {
		try {
			AddOnServiceStub svc = new AddOnServiceStub();
			GetAllFilesForAddOn addon = new GetAllFilesForAddOn();
			addon.setAddOnID(268560);
			GetAllFilesForAddOnResponse res = svc.getAllFilesForAddOn(addon);
			for (AddOnFile f : res.getGetAllFilesForAddOnResult().getAddOnFile()) {
				System.out.print(f.getFileName());
				System.out.print(" : ");
				System.out.println(f.getPackageFingerprint());
			}
			FingerprintMatchResult fingerprintMatchResult = svc.getFingerprintMatches(3752024154L);
			System.out.println(fingerprintMatchResult.isExactMatchesSpecified());
		} catch (AxisFault e) {
			System.err.println(e.getReason());
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
}