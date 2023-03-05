public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    @Override
    public String toString() {
        return getName() + " - магическая сила - " + getMagicPower() +
                ", расстояние трансгресcии - " + getTransgressionDistance() + ", ум - " + mind +
                ", мудрость - " + wisdom + ", остроумие - " + wit + ", творчсетво - " + creation;
    }
    public void compareWith(Ravenclaw r1) {
        int pupil1 = this.mind + this.wisdom + this.wit + this.creation;
        int pupil2 = r1.mind + r1.wisdom + r1.wit + r1.creation;
        if (pupil1 > pupil2) {
            System.out.println(this.getName() + " лучший  Когтевранец, чем " + r1.getName());
        } else {
            System.out.println(r1.getName() + " лучший  Когтевранец, чем " + this.getName());
        }
    }
}
