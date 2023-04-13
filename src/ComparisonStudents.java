public class ComparisonStudents {

    public static void compare(Gryffindor[] gryffindor) {
        int index = 0;
        int indexMax = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Gryffindor students : gryffindor) {
            int totalPoints = 0;
            totalPoints = totalPoints + students.getPowerMagic() + students.getDistanceTransgression() + students.getNobility()
                    + students.getHonor() + students.getBravery();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                indexMax = index;
            }
            index++;
        }
        System.out.println("Лучший на факультете " + gryffindor[indexMax].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Hufflepuff[] hufflepuff) {
        int index = 0;
        int indexMax = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Hufflepuff students : hufflepuff) {
            int totalPoints = 0;
            totalPoints = totalPoints + students.getPowerMagic() + students.getDistanceTransgression() +
                    students.getLoyalty() + students.getHardworking() + students.getHonesty();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                indexMax = index;
            }
            index++;
        }
        System.out.println("Лучший на факультете " + hufflepuff[indexMax].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Ravenclaw[] ravenclaws) {
        int index = 0;
        int indexMax = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Ravenclaw studets : ravenclaws) {
            int totalPoints = 0;
            totalPoints = totalPoints + studets.getPowerMagic() + studets.getDistanceTransgression() + studets.getSmart() +
                    studets.getWisdom() + studets.getWitty() + studets.getCreative();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                indexMax = index;
            }
            index++;
        }
        System.out.println("Лучший на факультете " + ravenclaws[indexMax].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Slytherin[] slytherin) {
        int index = 0;
        int indexMax = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Slytherin studets : slytherin) {
            int totalPoints = 0;
            totalPoints = totalPoints + studets.getPowerMagic() + studets.getDistanceTransgression() +
                    studets.getTricky() + studets.getResolute() + studets.getAmbition() + studets.getResourcefulness();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                indexMax = index;
            }
            index++;
        }
        System.out.println("Лучший на факультете " + slytherin[indexMax].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compareTwoStudents(Gryffindor[] gryffindor, Hufflepuff[] hufflepuff, Ravenclaw[] ravenclaws,
                                          Slytherin[] slytherin) {
        System.out.println();
        java.util.Random random = new java.util.Random();
        int indexOne = random.nextInt(2);
        int indexTwo = random.nextInt(2);
        // как сделать случайный выбор факультета пока не понял, поставил в ручную
        if (slytherin[indexOne].getPowerMagic() + slytherin[indexOne].getDistanceTransgression() >
                hufflepuff[indexTwo].getPowerMagic() + hufflepuff[indexTwo].getDistanceTransgression()) {
            System.out.println("Студент - " +
                    slytherin[indexOne].getFirstName() + " " + slytherin[indexOne].getLastName() +
                    " круче по силе магии и расстоянию трансгрессии, чем " + " студент " +
                    hufflepuff[indexTwo].getFirstName() + " " + hufflepuff[indexTwo].getLastName());
        } else
            System.out.println("Студент - " +
                    hufflepuff[indexTwo].getFirstName() + " " + hufflepuff[indexTwo].getLastName() +
                    " круче, по силе магии и расстоянию трансгрессии, чем " + " студент " +
                    slytherin[indexOne].getFirstName() + " " + slytherin[indexOne].getLastName());
    }
}

