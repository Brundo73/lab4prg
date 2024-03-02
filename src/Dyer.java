public class Dyer extends Person {
    public Dyer() {
        super("Дайер");
    }
    public void congrat(Person recipient, String reason) {
        System.out.println(this.getName() + " поздравил " + recipient.getName() + " c " + reason);
    }
    public void feel(String feelings) {
        System.out.println(this.getName() + " испытывает " +  feelings);
        Insomnia.getExcited();
    }

    public void sleep() throws TooExitedToSleepException{
        if (Insomnia.ableSleep) {
            System.out.println(this.getName() + "лег спать");
        } else {
            throw new TooExitedToSleepException(this.getName());
        }
    }
    static class Insomnia {
        public static boolean ableSleep = true;
        public static void getExcited() {
            ableSleep = false;
        }
        public static void calmDown() {
            ableSleep = true;
        }
    }

}
