public class ComparisonStudent {


    public static void compare(Gryffindor[] gryffindor) {
        int i = 0;
        int j = 0;
        int maxPoint = Integer.MIN_VALUE;
        for (Gryffindor gryffindors : gryffindor) {
            int totalPoints = 0;
            totalPoints = totalPoints + gryffindors.getPowerMagic() + gryffindors.getDistanceTransgression() + gryffindors.getNobility()
            + gryffindors.getHonor() + gryffindors.getBravery();
            if (totalPoints > maxPoint) {
                maxPoint = totalPoints;
                j = i;
            }
            i++;
        }
        System.out.println("Лучший студент факультета: " + gryffindor[j].toString()
                + " / собравший: " + maxPoint + " очков.");
    }

//    public static void compare(Gryffindor[] gryffindor) {
//        int i = 0;
//        int j = 0;
//        int maxPoint = Integer.MIN_VALUE;
//        for (Gryffindor gryffindors : gryffindor) {
//            int totalPoints = 0;
//            totalPoints = totalPoints + gryffindors.getPowerMagic() + gryffindors.getDistanceTransgression() + gryffindors.getNobility()
//                    + gryffindors.getHonor() + gryffindors.getBravery();
//            if (totalPoints > maxPoint) {
//                maxPoint = totalPoints;
//                j = i;
//            }
//            i++;
//        }
//        System.out.println("Лучший студент факультета: " + gryffindor[j].toString()
//                + " / собравший: " + maxPoint + " очков.");
//    }
//
//    public static void compare(Gryffindor[] gryffindor) {
//        int i = 0;
//        int j = 0;
//        int maxPoint = Integer.MIN_VALUE;
//        for (Gryffindor gryffindors : gryffindor) {
//            int totalPoints = 0;
//            totalPoints = totalPoints + gryffindors.getPowerMagic() + gryffindors.getDistanceTransgression() + gryffindors.getNobility()
//                    + gryffindors.getHonor() + gryffindors.getBravery();
//            if (totalPoints > maxPoint) {
//                maxPoint = totalPoints;
//                j = i;
//            }
//            i++;
//        }
//        System.out.println("Лучший студент факультета: " + gryffindor[j].toString()
//                + " / собравший: " + maxPoint + " очков.");
//    }
//
//    public static void compare(Gryffindor[] gryffindor) {
//        int i = 0;
//        int j = 0;
//        int maxPoint = Integer.MIN_VALUE;
//        for (Gryffindor gryffindors : gryffindor) {
//            int totalPoints = 0;
//            totalPoints = totalPoints + gryffindors.getPowerMagic() + gryffindors.getDistanceTransgression() + gryffindors.getNobility()
//                    + gryffindors.getHonor() + gryffindors.getBravery();
//            if (totalPoints > maxPoint) {
//                maxPoint = totalPoints;
//                j = i;
//            }
//            i++;
//        }
//        System.out.println("Лучший студент факультета: " + gryffindor[j].toString()
//                + " / собравший: " + maxPoint + " очков.");
//    }
}
