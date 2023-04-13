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
                new Slytherin("Драко", "Малфой", scores(), scores(), scores(), scores(), scores(), scores()),
                new Slytherin("Грэхэм", "Монтегю", scores(), scores(), scores(), scores(), scores(), scores()),
                new Slytherin("Грегори", "Гойл", scores(), scores(), scores(), scores(), scores(), scores()),
        };

        PrintStudent.print(gryffindor);
        PrintStudent.print(hufflepuff);
        PrintStudent.print(ravenclaw);
        PrintStudent.print(slytherin);
        ComparisonStudents.compare(gryffindor);
        ComparisonStudents.compare(hufflepuff);
        ComparisonStudents.compare(ravenclaw);
        ComparisonStudents.compare(slytherin);
        ComparisonStudents.compareTwoStudents(gryffindor, hufflepuff, ravenclaw, slytherin);
    }
}