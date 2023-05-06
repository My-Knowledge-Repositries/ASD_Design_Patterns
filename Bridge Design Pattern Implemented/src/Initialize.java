public class Initialize {
    public static void main(String[] args) {
        USAWorkshop usaWorkshop = new USAWorkshop(new Bmw());
        usaWorkshop.process();

        JapanWorkshop japanWorkshop = new JapanWorkshop(new Audi());
        japanWorkshop.process();
    }
}
