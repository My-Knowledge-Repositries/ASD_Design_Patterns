public class Initialize {
    public static void main(String[] args) {
        AppServer appServer = new LegacyAppUI();
        appServer.displayData(new XMLData());
        //------------
        AppServer modernUi = new ModernUiAdapter(new ModernAppUi());
        modernUi.displayData(new XMLData());
    }
}
