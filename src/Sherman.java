public class Sherman extends Person {
    public Sherman() {
        super("Шерман");
    }
    public void congrat(Person recipient, String reason) {
        String post = "главы базы в Мак-Мердо";
        System.out.println(this.getName() + " поздравил " + recipient.getName() + " c " + reason + " от лица " + post);
    }
}
