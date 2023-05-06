public class Initialize {
    public static void main(String[] args) {
        AppServer appServer = new LegacyAppUI();
        appServer.displayData(new XMLData());
    }
}
