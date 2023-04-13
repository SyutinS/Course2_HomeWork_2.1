public class ComparisonStudents {

    public static void compare(Gryffindor[] gryffindor) {
        int i = 0;
        int j = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Gryffindor studets : gryffindor) {
            int totalPoints = 0;
            totalPoints = totalPoints + studets.getPowerMagic() + studets.getDistanceTransgression() + studets.getNobility()
            + studets.getHonor() + studets.getBravery();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                j = i;
            }
            i++;
        }
        System.out.println("Лучший на факультете " + gryffindor[j].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Hufflepuff[] hufflepuff) {
        int i = 0;
        int j = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Hufflepuff hufflepuffs : hufflepuff) {
            int totalPoints = 0;
            totalPoints = totalPoints + hufflepuffs.getPowerMagic() + hufflepuffs.getDistanceTransgression() +
                    hufflepuffs.getLoyalty() + hufflepuffs.getHardworking() + hufflepuffs.getHonesty();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                j = i;
            }
            i++;
        }
        System.out.println("Лучший на факультете " + hufflepuff[j].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Ravenclaw[] ravenclaws) {
        int i = 0;
        int j = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Ravenclaw studets : ravenclaws) {
            int totalPoints = 0;
            totalPoints = totalPoints + studets.getPowerMagic() + studets.getDistanceTransgression() + studets.getSmart() +
                    studets.getWisdom() + studets.getWitty() + studets.getCreative();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                j = i;
            }
            i++;
        }
        System.out.println("Лучший на факультете " + ravenclaws[j].toString()
                + " / собравший: " + maxPoint + " балов.");
    }

    public static void compare(Slytherin[] slytherin) {
        int i = 0;
        int j = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Slytherin studets : slytherin) {
            int totalPoints = 0;
            totalPoints = totalPoints + studets.getPowerMagic() + studets.getDistanceTransgression() +
                    studets.getTricky() + studets.getResolute() + studets.getAmbition() + studets.getResourcefulness();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                j = i;
            }
            i++;
        }
        System.out.println("Лучший на факультете " + slytherin[j].toString()
                + " / собравший: " + maxPoint + " балов.");
    }
}
