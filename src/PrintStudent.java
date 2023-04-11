public class PrintStudent {
    public static void print(Student[] student) {
//        System.out.println("Студенты факультета: " );
//        System.out.println();
        for (int i = 0; i < student.length; i++) {
            Student students = student[i];
            System.out.println(students.toString());
        }
        System.out.println();
    }
}
