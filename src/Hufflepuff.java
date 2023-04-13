public class Hufflepuff extends Student {
    // Пуффиндуй: трудолюбивы, верны, честны.
    private final int powerMagic;
    private final int distanceTransgression;
    private final int hardworking;
    private final int loyalty;
    private final int honesty;


    public Hufflepuff(String firstName, String lastName, int powerMagic, int distanceTransgression, int hardworking, int loyalty, int honesty) {
        super(firstName, lastName);
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй: " + super.toString() +
                " / сила магии = " + powerMagic +
                " / расстояние трансгрессии = " + distanceTransgression +
                "/ трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}
