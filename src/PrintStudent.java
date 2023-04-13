public class PrintStudent {

    public static void print(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor students = gryffindor[i];
            System.out.println(students.toString());
        }
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuff) {
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff students = hufflepuff[i];
            System.out.println(students.toString());
        }
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw students = ravenclaw[i];
            System.out.println(students.toString());
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin students = slytherin[i];
            System.out.println(students.toString());
        }
        System.out.println();
    }
}



//    public static void print(Student[] student) {
////        System.out.println("Студенты факультета: " );
////        System.out.println();
//        for (int i = 0; i < student.length; i++) {
//            Student students = student[i];
//            System.out.println(students.toString());
//        }
//        System.out.println();
//    }
//}
