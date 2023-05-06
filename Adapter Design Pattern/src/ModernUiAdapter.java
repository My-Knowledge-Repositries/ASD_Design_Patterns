public class ModernUiAdapter implements AppServer{

    private final ModernAppUi modernAppUi;

    public ModernUiAdapter(ModernAppUi modernAppUi) {
        this.modernAppUi = modernAppUi;
    }

    @Override
    public void displayData(XMLData xmlData) {
        System.out.println("Running with Json Data");
    }

    private JsonData convertor(XMLData data){
        return new JsonData();
    }
}
