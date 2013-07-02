package callfire.api.wsdl;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.engine.AxisConfiguration;

import com.callfire.api.service.xsd.CreateSoundDocument;
import com.callfire.api.service.xsd.CreateSoundDocument.CreateSound;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AxisConfiguration axisConfiguration = new AxisConfiguration();
			axisConfiguration.addParameter("login", "72f42300c1a1");
			axisConfiguration.addParameter("password", "44261a4592146a63");
			CallServiceApiStub callService = new CallServiceApiStub();
			CreateSoundDocument createSoundDoc = CreateSoundDocument.Factory.newInstance();
			CreateSound createSound = createSoundDoc.addNewCreateSound();
			createSound.save(new File("test_mp3.mp3"));
			callService.createSound(createSoundDoc);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceFault e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
