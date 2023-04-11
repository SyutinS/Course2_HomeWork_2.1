public class Slytherin extends Student {
    //хитрость, решительность, амбициозность, находчивость и жажда власти.
    private final int tricky;
    private final int resolute;
    private final int ambition;
    private final int resourcefulness;

    public Slytherin(String firstName, String lastName, int powerMagic, int distanceTransgression, int tricky, int resolute, int ambition, int resourcefulness) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        this.tricky = tricky;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getTricky() {
        return tricky;
    }

    public int getResolute() {
        return resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    @Override
    public String toString() {
        return "Слизерин: " + super.toString() +
                " хитрость = " + tricky +
                ", решительность = " + resolute +
                ", амбициозность = " + ambition +
                ", находчивость и жажда власти = " + resourcefulness;
    }
}
