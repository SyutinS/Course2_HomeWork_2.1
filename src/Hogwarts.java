public class Hogwarts {
    public static void main(String[] args) {
//        Student[] student = {
//                new Student ("Гарри", "Потер"),
//                new Student ("Хрень", "Малой"),
//        };
//        Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
//        Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
//        На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
//        На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.
        Gryffindor[] gryffindor = {
                new Gryffindor("Гарри", "Поттер", 100, 50, 2, 5, 100),
                new Gryffindor("Гермиона", "Грейнджер", 90, 80, 2, 5, 100),
                new Gryffindor("Рон", "Уизли", 10, 40, 2, 5, 100),
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

//        PrintStudent printStudent = new PrintStudent();
        PrintStudent.print(gryffindor);
        PrintStudent.print(hufflepuff);
        PrintStudent.print(ravenclaw);
        PrintStudent.print(slytherin);
        ComparisonStudent.comparison(gryffindor);
//        ComparisonStudent.comparison(hufflepuff);
//        ComparisonStudent.comparison(ravenclaw);
//        ComparisonStudent.comparison(slytherin);
    }
}