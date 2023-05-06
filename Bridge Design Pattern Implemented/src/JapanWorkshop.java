public class JapanWorkshop extends Workshop {
    public JapanWorkshop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Type Japan");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(500);
    }
}
