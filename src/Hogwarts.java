public class Hogwarts {
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 100, 50, 20, 30, 100),
                new Gryffindor("Гермиона", "Грейнджер", 900, 80, 30, 50, 100),
                new Gryffindor("Рон", "Уизли", 10, 40, 25, 40, 100),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Захария", "Смит", 60, 40, 2, 4, 5),
                new Hufflepuff("Седрик", "Диггори", 45, 75, 2, 4, 5),
                new Hufflepuff("Джастин", "Финч-Флетчли", 25, 78, 2, 4, 5),
        };

        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Чжоу", "Чанг", 90 , 40, 5,8,10,20),
                new Ravenclaw("Падма", "Патил", 30, 45, 5,8,10,20),
                new Ravenclaw("Маркус", "Белби", 30, 70, 5,8,10,20),
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
        ComparisonStudent.compare(gryffindor);
        ComparisonStudent.compare(hufflepuff);
        ComparisonStudent.compare(ravenclaw);
        ComparisonStudent.compare(slytherin);
    }
}