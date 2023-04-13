import java.util.Random;

public class Gryffindor extends Student {
    //Гриффиндорцам присущи благородство, честь и храбрость.
//    private final String firstName;
//    private final String lastName;
    private final int powerMagic;
    private final int distanceTransgression;
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String firstName, String lastName, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(firstName, lastName);
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
//                "Студент:" + /*getClass() + ": " +*/
//                " " + firstName +
//                " " + lastName +
                " / сила магии = " + powerMagic +
                " / расстояние трансгрессии = " + distanceTransgression +
                "/ благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery;
    }
}
