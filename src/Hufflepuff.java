public class Hufflepuff extends Student {
   // Puffendyi трудолюбивы, верны, честны.
    private final int hardworking;
    private final int loyalty;
    private final int honesty;


    public Hufflepuff(String firstName, String lastName, int powerMagic, int distanceTransgression, int hardworking, int loyalty, int honesty) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
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
                " трудолюбие = " + hardworking +
                ", верность = " + loyalty +
                ", честность = " + honesty;
    }
}
