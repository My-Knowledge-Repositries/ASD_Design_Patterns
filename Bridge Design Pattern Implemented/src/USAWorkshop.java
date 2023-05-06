public class USAWorkshop extends Workshop {


    public USAWorkshop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Type USA");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(250);
    }
}
