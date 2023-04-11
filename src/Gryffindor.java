import java.util.Random;

public class Gryffindor extends Student {
    public static int getNobility;
    public static int getHonor;
    public static Integer getBravery;
    //Гриффиндорцам присущи благородство, честь и храбрость.
    private static int nobility;
    private static int honor;
    private static int bravery;

    public Gryffindor(String firstName, String lastName, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static int getNobility() {
        return nobility;
    }

    public static int getHonor() {
        return honor;
    }

    public static int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
                " благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}
