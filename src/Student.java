public class Student { // Сила магии и расстояние трансгресии
    private final String firstName;
    private final String lastName;
//    private final int powerMagic;
//    private final int distanceTransgression;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        this.powerMagic = powerMagic;
//        this.distanceTransgression = distanceTransgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public int getPowerMagic() {
//        return powerMagic;
//    }
//
//    public int getDistanceTransgression() {
//        return distanceTransgression;
//    }

    @Override
    public String toString() {
        return "Студент: " +
                " " + firstName +
                " " + lastName;
    }
}
