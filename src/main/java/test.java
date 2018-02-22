import addons.curse.AddOnFile;
import addons.curse.FingerprintMatchResult;
import com.curse.addonservice.GetAllFilesForAddOn;
import com.curse.addonservice.GetAllFilesForAddOnResponse;
import com.thiakil.curseapi.AddOnServiceStub;
import com.thiakil.curseapi.login.CurseAuth;
import com.thiakil.curseapi.login.CurseAuthException;
import com.thiakil.curseapi.login.CurseToken;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

/**
 * Created by Thiakil on 19/02/2018.
 */
public class test {
	public static void main(String[] args) throws CurseAuthException {
		if (args.length <2){
			throw new RuntimeException("need user and pass on command line");
		}
		try {
			CurseToken token = CurseAuth.getTokenFromCurseAccount(args[0], args[1]);
			AddOnServiceStub svc = new AddOnServiceStub(token);
			GetAllFilesForAddOn addon = new GetAllFilesForAddOn();
			addon.setAddOnID(268560);
			GetAllFilesForAddOnResponse res = svc.getAllFilesForAddOn(addon);
			for (AddOnFile f : res.getGetAllFilesForAddOnResult().getAddOnFile()) {
				System.out.print(f.getFileName());
				System.out.print(" : ");
				System.out.println(f.getPackageFingerprint());
			}
			FingerprintMatchResult fingerprintMatchResult = svc.getFingerprintMatches(3752024154L);
			System.out.println(fingerprintMatchResult.getExactMatches().getFingerprintMatch()[0].getId());
		} catch (AxisFault e) {
			System.err.println(e.getReason());
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
}