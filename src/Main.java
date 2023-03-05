public class Main {
    public static void printSeparator() {
    System.out.println("-----------------------");
}
    public static void printStudy(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 92, 70, 95, 95, 99);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 99, 87, 78, 82);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 72, 68, 65, 80, 75);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 67, 58, 80, 75, 31);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 90, 78, 85, 76, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 43, 66, 54, 57, 85);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 43, 58, 92, 67, 78, 32);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 78, 90, 34, 87, 32, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 78, 98, 89, 69, 78, 56);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 87, 68, 97, 54, 23, 90);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 67, 76, 84, 79, 43, 25);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 87, 43, 68, 78, 34, 98);

        printStudy(harryPotter);
        printSeparator();

        hermioneGranger.compareWith(ronWeasley);
        printSeparator();

        zachariahSmith.compareWith(justinFinchFletchley);
        printSeparator();

        zhouChang.compareWith(marcusBelby);
        printSeparator();

        grahamMontagu.compareWith(gregoryGoyle);
        printSeparator();

        harryPotter.compareWith(dracoMalfoy);
        printSeparator();
    }
}