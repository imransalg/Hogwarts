public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return getName() + " - магическая сила - " + getMagicPower() +
                ", расстояние трансгреcсии - " + getTransgressionDistance() +
                ", трудолюбие - " + industriousness + ", верность - " + loyalty + ", честность - " + honesty;
    }
    public void compareWith(Hufflepuff h1) {
        int pupil1 = this.industriousness + this.loyalty + this.honesty;
        int pupil2 = h1.industriousness + h1.loyalty + h1.honesty;
        if (pupil1 > pupil2) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + h1.getName());
        } else {
            System.out.println(h1.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }
}
