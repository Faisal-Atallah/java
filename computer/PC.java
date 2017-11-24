public class PC


{


    private Case theCase;
    private Monitor monitor;
    private Motherboaed motherboaed;


    public PC(Case theCase, Monitor monitor, Motherboaed motherboaed) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboaed = motherboaed;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboaed getMotherboaed() {
        return motherboaed;
    }




}
