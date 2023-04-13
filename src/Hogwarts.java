public class Hogwarts {

private static int scores() {
    java.util.Random random = new java.util.Random();
    int score;
    score = random.nextInt(100);
    return score;
}

    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", scores(), scores(), scores(), scores(), scores()),
                new Gryffindor("Гермиона", "Грейнджер", scores(), scores(), scores(), scores(), scores()),
                new Gryffindor("Рон", "Уизли", scores(), scores(), scores(), scores(), scores()),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария", "Смит", scores(), scores(), scores(), scores(), scores()),
                new Hufflepuff("Седрик", "Диггори", scores(), scores(), scores(), scores(), scores()),
                new Hufflepuff("Джастин", "Финч-Флетчли", scores(), scores(), scores(), scores(), scores()),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", scores(), scores(), scores(), scores(), scores(), scores()),
                new Ravenclaw("Падма", "Патил", scores(), scores(), scores(), scores(), scores(), scores()),
                new Ravenclaw("Маркус", "Белби", scores(), scores(), scores(), scores(), scores(), scores()),
        };

        Slytherin[] slytherin = {
                new Slytherin("Драко", "Малфой", 90, 68, 50,50,50,47),
                new Slytherin("Грэхэм", "Монтегю", 70, 30, 50,50,50,47),
                new Slytherin("Грегори", "Гойл", 70, 50, 30,50,50,47),
        };

        PrintStudent.print(gryffindor);
        PrintStudent.print(hufflepuff);
        PrintStudent.print(ravenclaw);
        PrintStudent.print(slytherin);
        ComparisonStudents.compare(gryffindor);
        ComparisonStudents.compare(hufflepuff);
        ComparisonStudents.compare(ravenclaw);
        ComparisonStudents.compare(slytherin);
    }
}