public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public void compareWith(Hogwarts h1) {
        if (this.magicPower > h1.magicPower) {
            System.out.print(this.name + " обладает большей мощьностью магии,");
        } else {
            System.out.print(this.name + " обладает большей мощьностью магии,");
        }
        if (this.transgressionDistance > h1.transgressionDistance) {
            System.out.print(" и большим расстоянием трансгрессии ");
        } else {
            System.out.println(" и меньшим расстоянием трангрессии ");
        }
        System.out.println(", чем " + h1.name);
    }
}
