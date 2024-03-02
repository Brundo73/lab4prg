public class Pebody extends Person{
    public Pebody() {
        super("Пэбоди");
    }
    public void feel(String feelings) {
        System.out.println(this.getName() + " испытывает " +  feelings);
    }

}
