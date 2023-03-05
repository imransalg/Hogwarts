public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + " - магическая сила - " + getMagicPower() +
                ", расстояние трансгреcсии - " + getTransgressionDistance() +
                ", благородство - " + nobility + ", честь - " + honor + ", храбрость - " + bravery;
    }
    public void compareWith(Gryffindor g1) {
        int pupil1 = this.nobility + this.honor + this.bravery;
        int pupil2 = g1.nobility + g1.honor + g1.bravery;
        if (pupil1 > pupil2) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + g1.getName());
        } else {
            System.out.println(g1.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }
}