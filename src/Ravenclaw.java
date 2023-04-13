public class Ravenclaw extends Student {
    // Когтевран: умны, мудры, остроумны и полны творчества.
    private final int powerMagic;
    private final int distanceTransgression;
    private final int smart;
    private final int wisdom;
    private final int witty;
    private final int creative;

    public Ravenclaw(String firstName, String lastName, int powerMagic, int distanceTransgression, int smart, int wisdom, int witty, int creative) {
        super(firstName, lastName);
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return "Когтевран: " + super.toString() +
                " / сила магии = " + powerMagic +
                " / расстояние трансгрессии = " + distanceTransgression +
                "/ ум = " + smart +
                ", мудрость = " + wisdom +
                ", остроумие = " + witty +
                ", творчество = " + creative;
    }
}
