public class Douglas extends Person {
    public Douglas() {
        super("Дуглас");
    }
    public void congrat(Person recipient, String reason) {
        String post = " команды 'Аркхема'";
        System.out.println(this.getName() + " поздравил " + recipient.getName() + " c " + reason + " от лица " + post);
    }
}
