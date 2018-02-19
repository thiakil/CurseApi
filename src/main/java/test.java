import com.curse.addonservice.GetAllFilesForAddOn;
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
			svc.getAllFilesForAddOn(addon);
		} catch (AxisFault e) {
			System.err.println(e.getReason());
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}
}