import javax.lang.model.element.Element;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.events.Namespace;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Paths;
import java.security.spec.ECField;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Flow;

public class Inet {
//    public static String check()
//    {
//        return "hello";
//    }
//
//    public enum FLOWS {
//        MARKET_SCENARIO("marketScenario"),
//        CE_STRESS("ceStress");
//
//        public final String marketScenario;
//
//        private FLOWS(String marketScenario) {
//            this.marketScenario = marketScenario;
//        }
//    };
    
    public static void main(String[] args) {
        ParentConfig parentConfig = new ChildConfig1("sam", "30", 50L);
//        System.out.println(parentConfig.getMarks());

    }
}
