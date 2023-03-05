public class Main {
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

        compareGryffindorStudents(hermioneGranger, ronWeasley);
        printSeparator();

        compareHufflepuffStudents(zachariahSmith, justinFinchFletchley);
        printSeparator();

        compareRavenclawStudents(zhouChang, marcusBelby);
        printSeparator();

        compareSlytherinStudents(grahamMontagu, gregoryGoyle);
        printSeparator();

        compareHogwartsStudents(harryPotter,dracoMalfoy);
        printSeparator();
    }
    public static void printSeparator() {
        System.out.println("-----------------------");
    }
    public static void printStudy(Object obj) {
        System.out.println(obj);
    }
    public static void compareGryffindorStudents(Gryffindor g1, Gryffindor g2) {
        int pupil1 = g1.getNobility() + g1.getHonor() + g1.getBravery();
        int pupil2 = g2.getNobility() + g2.getHonor() + g2.getBravery();
        if (pupil1 > pupil2) {
            System.out.println(g1.getName() + " лучший Гриффиндорец, чем " + g2.getName());
        } else {
            System.out.println(g2.getName() + " лучший Гриффиндорец, чем " + g1.getName());
        }
    }
    public static void compareHufflepuffStudents(Hufflepuff h1, Hufflepuff h2) {
        int pupil1 = h1.getIndustriousness() + h1.getLoyalty() + h1.getHonesty();
        int pupil2 = h2.getIndustriousness() + h2.getLoyalty() + h2.getHonesty();
        if (pupil1 > pupil2) {
            System.out.println(h1.getName() + " лучший Пуффендуец, чем " + h2.getName());
        } else {
            System.out.println(h2.getName() + " лучший Пуффендуец, чем " + h1.getName());
        }
    }
    public static void compareRavenclawStudents(Ravenclaw r1, Ravenclaw r2) {
        int pupil1 = r1.getMind() + r1.getWisdom() + r1.getWit() + r1.getCreation();
        int pupil2 = r2.getMind() + r2.getWisdom() + r2.getWit() + r2.getCreation();
        if (pupil1 > pupil2) {
            System.out.println(r1.getName() + " лучший  Когтевранец, чем " + r2.getName());
        } else {
            System.out.println(r2.getName() + " лучший  Когтевранец, чем " + r1.getName());
        }
    }public static void compareSlytherinStudents(Slytherin s1, Slytherin s2) {
        int pupil1 = s1.getCunning() + s1.getDetermination() + s1.getAmbition() + s1.getResourcefulness();
        int pupil2 = s2.getCunning() + s2.getDetermination() + s2.getAmbition() + s2.getResourcefulness();
        if (pupil1 > pupil2) {
            System.out.println(s1.getName() + " лучший  Слизеринец, чем " + s2.getName());
        } else {
            System.out.println(s2.getName() + " лучший  Слизеринец, чем " + s1.getName());
        }
    }
    public static void compareHogwartsStudents(Hogwarts h1, Hogwarts h2) {
        if (h1.getMagicPower() > h2.getMagicPower()) {
            System.out.print(h1.getName() + " обладает большей мощьностью магии,");
        } else {
            System.out.print(h1.getName() + " обладает большей мощьностью магии,");
        }
        if (h1.getTransgressionDistance() > h2.getTransgressionDistance()) {
            System.out.print(" и большим расстоянием трансгрессии ");
        } else {
            System.out.println(" и меньшим расстоянием трангрессии ");
        }
        System.out.println(", чем " + h2.getName());
    }
}