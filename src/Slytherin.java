public class Slytherin extends Student {
    //Слизерин: хитрость, решительность, амбициозность, находчивость и жажда власти.
    private final int powerMagic;
    private final int distanceTransgression;
    private final int tricky;
    private final int resolute;
    private final int ambition;
    private final int resourcefulness;

    public Slytherin(String firstName, String lastName, int powerMagic, int distanceTransgression, int tricky, int resolute, int ambition, int resourcefulness) {
        super(firstName, lastName);
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.tricky = tricky;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
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
                " / сила магии = " + powerMagic +
                " / расстояние трансгрессии = " + distanceTransgression +
                "/ хитрость = " + tricky +
                ", решительность = " + resolute +
                ", амбициозность = " + ambition +
                ", находчивость и жажда власти = " + resourcefulness;
    }
}
