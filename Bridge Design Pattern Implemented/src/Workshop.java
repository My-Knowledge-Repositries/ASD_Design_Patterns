public abstract class Workshop {
    protected Engine engine;

    public Workshop(Engine engine) {
        this.engine = engine;
    }

    abstract void setType();

    abstract void setSpeed();

    public void process() {
        setType();
        setSpeed();
        engine.assemble();
    }
}
