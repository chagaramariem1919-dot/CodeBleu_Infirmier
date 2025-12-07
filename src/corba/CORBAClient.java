package corba;

import corba.UrgenceService;
import corba.UrgenceServiceHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class CORBAClient {
    private UrgenceService urgenceService;

    public CORBAClient(String[] args) {
        try {
            // ⚠️ Initialise l'ORB avec le port correct du tnameserv
            String[] argsORB = new String[] {
                "-ORBInitialHost", "127.0.0.1",
                "-ORBInitialPort", "900"
            };
            ORB orb = ORB.init(argsORB, null);

            // ⚠️ Lookup du service via NamingService
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            urgenceService = UrgenceServiceHelper.narrow(ncRef.resolve_str("UrgenceService"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long envoyerUrgence(String type, String chambre, String declarant) {
        try {
            return urgenceService.addUrgence(type, chambre, declarant);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
