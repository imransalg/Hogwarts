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
}
