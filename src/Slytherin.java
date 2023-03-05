public class Slytherin extends  Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    @Override
    public String toString() {
        return getName() + " - магическая сила - " + getMagicPower() +
                ", расстояние трансгресcии - " + getTransgressionDistance() + ", хитрость - " + cunning +
                ", решительность - " + determination + ",  амбициозность - " + ambition + ", находчивость - " + resourcefulness;
    }
    public void compareWith(Slytherin s1) {
        int pupil1 = this.cunning + this.determination + this.ambition + this.resourcefulness;
        int pupil2 = s1.cunning + s1.determination + s1.ambition + s1.resourcefulness;
        if (pupil1 > pupil2) {
            System.out.println(this.getName() + " лучший  Слизеринец, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " лучший  Слизеринец, чем " + this.getName());
        }
    }
}
