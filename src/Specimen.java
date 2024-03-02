public class Specimen {
    public final int durability;
    public final String name;

    public Specimen(String name, int durability) {
        this.durability = durability;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getDurability() {
        return this.durability;
    }
}
