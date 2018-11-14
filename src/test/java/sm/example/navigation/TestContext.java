package sm.example.navigation;

import java.util.Properties;

public class TestContext {
    private static String url;
    private static String externalFindingId;
    private static String externalFindingActionId;

    static {
        Properties properties = PropertiesLoader.load();
        assignProperties(properties);
    }

    private static void assignProperties(Properties prop) {
        url = prop.getProperty("gfms.baseUrl");
        url = prop.getProperty("gfms.externalFindingId");
        url = prop.getProperty("gfms.externalFindingActionId");
    }

    public static String getUrl() {
        return url;
    }
    public static String getExternalFindingId() {
        return externalFindingId;
    }
    public static String getExternalFindingActionId() {
        return externalFindingActionId;
    }

}