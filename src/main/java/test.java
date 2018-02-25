import addons.curse.AddOnFile;
import addons.curse.FingerprintMatchResult;
import com.curse.addonservice.GetAllFilesForAddOn;
import com.curse.addonservice.GetAllFilesForAddOnResponse;
import com.thiakil.curseapi.login.RenewTokenResponse;
import com.thiakil.curseapi.soap.AddOnServiceStub;
import com.thiakil.curseapi.login.CurseAuth;
import com.thiakil.curseapi.login.CurseAuthException;
import com.thiakil.curseapi.login.CurseToken;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.List;

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
			//RenewTokenResponse res1 = CurseAuth.renewAccessToken(token.token);
			AddOnServiceStub svc = new AddOnServiceStub(token);
			List<AddOnFile> res = svc.getAllFilesForAddOn(269708);
			for (AddOnFile f : res) {
				System.out.print(f.getFileName());
				System.out.print(" : ");
				System.out.println(f.getPackageFingerprint());
			}
			FingerprintMatchResult fingerprintMatchResult = svc.getFingerprintMatches(3752024154L);
			System.out.println(fingerprintMatchResult.getExactMatches().get(0).getId());
		} catch (AxisFault e) {
			System.err.println(e.getReason());
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
}